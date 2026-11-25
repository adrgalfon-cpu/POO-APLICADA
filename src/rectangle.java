public class rectangle {
    private int x;
    private int y;
    private int longitud;
    private int altura;
    public rectangle(int x, int y, int longitud, int altura){
        this.x = x;
        this.y = y;
        this.longitud = longitud;
        this.altura = altura;
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
    public void modificar(int novaX, int novaY, int novaAltura, int novaLongitud){
        x = novaX;
        y = novaY;
        altura = novaAltura;
        longitud = novaLongitud;
    }
    public boolean getDintreDimensions(int coordX, int coordY){
        boolean check = false;
        if ((coordX>=getEsquerra()&&coordX<=getDreta())&&(coordY>=getAmunt()&&coordY<=getAbaix())){
            check = true;
        }
        return check;
    }
}
