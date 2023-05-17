package domain;
import java.util.ArrayList;

public class Universe {

  boolean [][] universe;


    public Universe(boolean[][] universe) {
        this.universe = universe;
    }

    public boolean[][] getNewUniverse(boolean[][] board){

        //We get the universe and we pass the coordinates to  getStatusNeighbors method
        // and get the status of cell
        for (int b = 0; b < board.length; b++) {
            for (int i = 0; i < board[b].length; i++) {
                board[b][i]=getStatusNeighbors(b,i);
            }
        }
        return board;
    }

    public boolean getStatusNeighbors(int x, int y) {
        //Cell with status of this position
        Cell cell = new Cell(universe[x][y]);

        ArrayList positions = new ArrayList();
        //we create a array with 8 status around of cell.
        positions.add(checkCellUpLeft(x,y));
        positions.add(checkCellUp(x,y));
        positions.add(checkCellUpRight(x,y));
        positions.add(checkCellRight(x,y));
        positions.add(checkCellDownRight(x,y));
        positions.add(checkCellDown(x,y));
        positions.add(checkCellDownLeft(x,y));
        positions.add(checkCellLeft(x,y));

        //we test the array and check the number of cells live around of us cell.
        long numberRepetitions = positions.stream().filter(c->c.equals(true)).count();


        if(cell.isStatus()) {
            //Any live cell with fewer than two live neighbours dies, as if caused by under-population.
            if (numberRepetitions < 2) {
                return false;
            }
            //Any live cell with two or three live neighbours lives on to the next generation.
            if (numberRepetitions == 2 || numberRepetitions == 3) {
                return true;
            }
            //Any live cell with more than three live neighbours dies, as if by overcrowding.
            if (numberRepetitions > 3) {
                return false;
            }
        }else {
            //Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
            if (cell.isStatus() == false && numberRepetitions == 3) {
                return true;
            }
        }
        return false;
    }


    //Cells outside the bounds of the array should be considered permanently dead (they never come to life).

    private boolean checkCellUpLeft(int x, int y) {
        if(x==0||y== universe.length-1){return false;}
        return universe[x-1][y+1];
    }
    private boolean checkCellUp(int x, int y) {
        if(y==universe.length-1){return false;}
        return universe[x][y+1];
    }
    private boolean checkCellUpRight(int x, int y) {
        if(x==universe.length-1||y==universe.length-1){return false;}
        return universe[x+1][y+1];
    }
    private boolean checkCellRight(int x, int y) {
        if(x==universe.length-1){return false;}
        return universe[x+1][y];
    }
    private boolean checkCellDownRight(int x, int y) {
        if(x==universe.length-1||y==0){return false;}
        return universe[x+1][y-1];
    }
    private boolean checkCellDown(int x, int y) {
        if(y==0){return false;}
        return universe[x][y-1];
    }
    private boolean checkCellDownLeft(int x, int y) {
        if(x==0||y==0){return false;}
        return universe[x-1][y-1];
    }
    private boolean checkCellLeft(int x, int y) {
        if(x==0){return false;}
        return universe[x-1][y];
    }


}
