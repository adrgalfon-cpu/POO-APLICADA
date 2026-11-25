public class Rectangle {
    private int x;
    private int y;
    private int longitud;
    private int altura;
    public Rectangle(int x, int y, int longitud, int altura){
        this.x = x;
        this.y = y;
        this.longitud = longitud-1;
        this.altura = altura-1;
    }
    public int getEsquerra(){
        return x;
    }
    public int getDreta(){
        return x+longitud;
    }
    public int getAmunt(){
        return y;
    }
    public int getAbaix(){
        return y+altura;
    }
    public void modificar(int novaX, int novaY, int novaLongitud, int novaAltura){
        x = novaX;
        y = novaY;
        altura = novaAltura-1;
        longitud = novaLongitud-1;
    }
    public boolean getDintreDimensions(int coordX, int coordY){
        boolean check = false;
        if ((coordX>=getEsquerra()&&coordX<=getDreta())&&(coordY>=getAmunt()&&coordY<=getAbaix())){
            check = true;
        }
        return check;
    }
}
