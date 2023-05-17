import Controller.Console;
import Service.GameOfLife;

public class Main {
    public static void main(String[] args) {
        Console console = new Console();
        console.printMessage();
        boolean[][] universeOfCell = new boolean[][]{{false, false, false, false, false, false, true, false},
                                                    {false, false, false, true, false, false, false, true},
                                                    {false, false, true, true, false, false, false, false},
                                                    {false, false, false, false, false, true, true, false},
                                                    {false, false, false, false, false, true, false, false},
                                                    {false, true, true, false, false, true, false, false},
                                                    {false, false, false, false, false, false, false, false},
                                                    {false, false, false, false, false, false, false, false}};

        GameOfLife gameOfLife = new GameOfLife(universeOfCell);
    }
}
