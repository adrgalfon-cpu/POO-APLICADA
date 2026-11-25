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
        Scanner scanner = new Scanner(System.in);
        Tauler tauler = new Tauler(10, 10,"[ ]","▐█▌");
        //Nou objecte rectangle
        Rectangle jugador = new Rectangle(0,0,1,1);
        char direccio = 'o';
        boolean running = true;
        System.out.println("""
                ===========================================================================
                =============================Moure el jugador==============================
                ===========================================================================
                
                Mou el teu personatje!!!
                w, a, s, d com a controls basics i qualsevol altre lletra per sortir.
                """);
        while (running){
            tauler.reiniciarTauler();
            tauler.afegirRectangle(jugador);
            tauler.dibuixarTauler();
            direccio = scanner.next().charAt(0);
            switch (direccio){
                case 'w':
                    jugador.modificar(
                            jugador.getEsquerra(),
                            jugador.getAmunt()-1,
                            jugador.getlongitud(),
                            jugador.getAltura()
                    );
                    break;
                case 's':
                    jugador.modificar(
                            jugador.getEsquerra(),
                            jugador.getAmunt()+1,
                            jugador.getlongitud(),
                            jugador.getAltura()
                    );
                    break;
                case 'a':
                    jugador.modificar(
                            jugador.getEsquerra()-1,
                            jugador.getAmunt(),
                            jugador.getlongitud(),
                            jugador.getAltura()
                    );
                    break;
                case 'd':
                    jugador.modificar(
                            jugador.getEsquerra()+1,
                            jugador.getAmunt(),
                            jugador.getlongitud(),
                            jugador.getAltura()
                    );
                    break;
                default:
                    System.out.println("Sortint del joc");
                    running = false;
                    break;
            }


        }
    }
}