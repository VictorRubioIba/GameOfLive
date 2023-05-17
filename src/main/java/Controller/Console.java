package Controller;

import domain.Universe;

public class Console {
    public void printMessage(){
        System.out.println("This is Game of Live");
    }
    public void printerConsole(boolean[][] universe){
        //if the cell is live we print O

        for (int u = 0; u < universe.length ; u++) {
            System.out.println("");
            for (int  i= 0;  i< universe[u].length; i++) {
            if(universe[u][i]==true) {
                System.out.print(universe[u][i]);
            }else{
                System.out.print("    ");
            }
                System.out.print(" ");

            }
        }
    }
}
