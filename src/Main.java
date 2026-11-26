import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        /*
//        Codi Exemple / Demostració
//        Es recomana ampliar la terminal fins poder veure els rectangles dins la matriu
//         */
//        //Nou objecte tauler
//        Scanner scanner = new Scanner(System.in);
//        Tauler tauler = new Tauler(10, 10,"[ ]","▐█▌");
//        //Nou objecte rectangle
//        Rectangle jugador = new Rectangle(0,0,1,1);
//        char direccio = 'o';
//        boolean running = true;
//        System.out.println("""
//                ===========================================================================
//                =============================Moure el jugador==============================
//                ===========================================================================
//
//                Mou el teu personatje!!!
//                w, a, s, d com a controls basics i qualsevol altre lletra per sortir.
//                """);
//        while (running){
//            tauler.reiniciarTauler();
//            tauler.afegirRectangle(jugador);
//            tauler.dibuixarTauler();
//            direccio = scanner.next().charAt(0);
//            switch (direccio){
//                case 'w':
//                    jugador.modificar(
//                            jugador.getEsquerra(),
//                            jugador.getAmunt()-1,
//                            jugador.getlongitud(),
//                            jugador.getAltura()
//                    );
//                    break;
//                case 's':
//                    jugador.modificar(
//                            jugador.getEsquerra(),
//                            jugador.getAmunt()+1,
//                            jugador.getlongitud(),
//                            jugador.getAltura()
//                    );
//                    break;
//                case 'a':
//                    jugador.modificar(
//                            jugador.getEsquerra()-1,
//                            jugador.getAmunt(),
//                            jugador.getlongitud(),
//                            jugador.getAltura()
//                    );
//                    break;
//                case 'd':
//                    jugador.modificar(
//                            jugador.getEsquerra()+1,
//                            jugador.getAmunt(),
//                            jugador.getlongitud(),
//                            jugador.getAltura()
//                    );
//                    break;
//                default:
//                    System.out.println("Sortint del joc");
//                    running = false;
//                    break;
//            }
//
//
//        }
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle0 = new Rectangle(0,0,4,4);
        Rectangle rectangle1 = new Rectangle(6,6,1,1);
        Tauler tauler = new Tauler(10,10,"[ ]","▐█▌");
        char move;
        while (true){
            tauler.reiniciarTauler();
            move = scanner.next().charAt(0);
            if (move=='a') {
                if (rectangle0.getDinsDimensions(rectangle1.getEsquerra()-1, rectangle1.getAmunt())){
                    rectangle1.modificar(rectangle0.getDreta()+1,rectangle1.getAmunt(),rectangle1.getlongitud(),rectangle1.getAltura());
                }else{
                    rectangle1.modificar(rectangle1.getEsquerra()-1,rectangle1.getAmunt(),rectangle1.getlongitud(),rectangle1.getAltura());
                }
            }else if (move=='d'){
                rectangle1.modificar(rectangle1.getEsquerra()+1,rectangle1.getAmunt(),rectangle1.getlongitud(),rectangle1.getAltura());
            } else if (move=='o') {
                rectangle0.modificar(rectangle0.getEsquerra(),rectangle0.getAmunt(),rectangle0.getlongitud(),rectangle0.getAltura()-4);
            } else if (move=='c') {
                rectangle0.modificar(rectangle0.getEsquerra(),rectangle0.getAmunt(),rectangle0.getlongitud(),rectangle0.getAltura()+4);
            } else {
                System.exit(0);
            }
            tauler.afegirRectangle(rectangle1);
            tauler.afegirRectangle(rectangle0);
            tauler.dibuixarTauler();
        }

    }
}