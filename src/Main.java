import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Codi Exemple / Demostració
        Es recomana ampliar la terminal fins poder veure els rectangles dins la matriu
         */
        //Nou objecte tauler
        Tauler tauler = new Tauler(6, 6,"[ ]","▐█▌");
        //Nou objecte rectangle
        Rectangle rectangle = new Rectangle(0,0,3,2);
        //Nou objecte rectangle1
        Rectangle rectangle1 = new Rectangle(3,3,2,2);
        //Afegim un l'objecte rectangle a la matriu interna de tauler (Clase Tauler)
        tauler.afegirRectangle(rectangle);
        tauler.afegirRectangle(rectangle1);
        tauler.dibuixarTauler();
        tauler.reiniciarTauler();
        System.out.println();
        tauler.dibuixarTauler();
        rectangle.modificar(1,1,1,4);
        tauler.afegirRectangle(rectangle);
        tauler.afegirRectangle(rectangle1);
        System.out.println();
        tauler.dibuixarTauler();
    }
}