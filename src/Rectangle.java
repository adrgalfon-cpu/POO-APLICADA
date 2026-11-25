public class Rectangle {
    private int x;
    private int y;
    private int longitud;
    private int altura;
    public Rectangle(int x, int y, int longitud, int altura){
        this.x = x;
        this.y = y;
        this.longitud = longitud;
        this.altura = altura;
    }
    public int getEsquerra(){
        return x;
    }
    public int getDreta(){
        return longitud+x-1;
    }
    public int getAbaix(){return altura+y-1;}
    public int getAmunt(){
        return y;
    }

    public void modificar(int novaX, int novaY, int novaLongitud, int novaAltura){
        x = novaX;
        y = novaY;
        altura = novaAltura;
        longitud = novaLongitud;
    }
    public int getlongitud (){
        return longitud;
    }
    public int getAltura (){
        return altura;
    }
    public boolean getDintreDimensions(int coordX, int coordY){
        boolean check = false;
        if ((coordX>=getEsquerra()&&coordX<=getDreta())&&(coordY>=getAmunt()&&coordY<=getAbaix())){
            check = true;
        }
        return check;
    }
}
