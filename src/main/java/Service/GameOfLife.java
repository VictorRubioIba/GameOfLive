package Service;

import Controller.Console;
import domain.Universe;

import java.util.Scanner;

public class GameOfLife {

    public GameOfLife(boolean[][] board){

        Universe universe = new Universe(board);
        Console console = new Console();

        do {
            console.printerConsole(universe.getNewUniverse(board));
            nextGen();
        }while(board.length>0);

    }
    public void nextGen() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

}
