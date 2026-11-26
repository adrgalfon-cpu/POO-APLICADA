public class Tauler {


    private boolean[][] dashboard;
    private String disenyDibuix;
    private String disenyBuit;


    public Tauler(int rows, int cols,String buits,String plens){
        dashboard = new boolean[rows][cols];
        disenyBuit = buits;
        disenyDibuix = plens;
    }

    public void afegirRectangle(Rectangle RectangleNou){
        for (int files = 0; files < dashboard.length; files++) {
            for (int columnes = 0; columnes < dashboard[0].length; columnes++) {
                if(RectangleNou.getDinsDimensions(files,columnes)){
                    dashboard[columnes][files] = true;
                }
            }
        }
    }
    public int getRows(){
        return dashboard[0].length;
    }
    public int getCols(){
        return dashboard.length;
    }
    public void reiniciarTauler(){
        for (int i = 0; i < dashboard.length; i++) {
            for (int j = 0; j < dashboard[0].length; j++) {
                dashboard[i][j] = false;
            }
        }
    }
    public void dibuixarTauler(){
        System.out.println();
        for (int i = 0; i < dashboard.length; i++) {
            for (int j = 0; j < dashboard[0].length; j++) {
                if (dashboard[i][j]){
                    System.out.print(disenyDibuix);
                }
                else {
                    System.out.print(disenyBuit);
                }
            }
            System.out.println();
        }
    }





}
