public class Main {
    public static void main(String[] args) {
        rectangle rectangle1 = new rectangle(3,1,4,2);
        rectangle rectangle2 = new rectangle(0,5,2,3);
        rectangle rectangle3 = new rectangle(4, 6, 5,3);
        rectangle[] rectangles = {rectangle1,rectangle2,rectangle3};
        Tauler tauler = new Tauler(10, 10,"[ ]","▐█▌");
        for (rectangle a : rectangles) {
            tauler.afegirRectangle(a);
        }
        tauler.dibuixarTauler();
    }
}