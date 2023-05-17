import domain.Cell;
import domain.Universe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestUniverse {

    boolean[][] universeOfCell= new boolean[8][8];


    @BeforeEach
    public void beforeEach() {
        universeOfCell = new boolean[][]{{false, false, false, false, false, false, true, false},
                                         {false, false, false, true, false, false, false, true},
                                         {false, false, true, true, false, false, false, false},
                                         {false, false, false, false, false, true, true, false},
                                         {false, false, false, false, false, true, false, false},
                                         {false, false, false, false, false, true, false, false},
                                         {false, false, false, false, false, false, false, false},
                                         {false, false, false, false, false, false, false, false}};
    }
    @Test
    @DisplayName("Test for check the size of universe")
    public void testCheckSizeOfUniverse(){

    }


    @Test
    @DisplayName("Test for check cell is live and  less two neighbors are live")
    public void testCheckIfLessTwoNeighbordsAreLive(){
        Universe universe = new Universe(universeOfCell);
        assertEquals(universe.getStatusNeighbors(4,2),false);

    }
    @Test
    @DisplayName("Test for check cell is live and two neighbors are live")
    public void testCheckIfTwoNeighbordsAreLive(){
        Universe universe = new Universe(universeOfCell);
        assertEquals(universe.getStatusNeighbors(2,2),true);

    }
    @Test
    @DisplayName("Test for check cell is live and three neighbors are live")
    public void testCheckIfThreeNeighbordsAreLive(){
        Universe universe = new Universe(universeOfCell);
        assertEquals(universe.getStatusNeighbors(4,4),true);

    }
    @Test
    @DisplayName("Test for check cell is live and three neighbors is live")
    public void testCheckIfGreaterThreeNeighbordsAreLive(){
        Universe universe = new Universe(universeOfCell);
        assertEquals(universe.getStatusNeighbors(4,6),false);

    }
    @Test
    @DisplayName("Test for check cell is died and three neighbors is live")
    public void testCheckIfThreeNeighbordsAreLiveAndCellDied(){
        Universe universe = new Universe(universeOfCell);
        assertEquals(universe.getStatusNeighbors(5,5),false);

    }

    @Test
    @DisplayName("Test for check cell is live and is next to limits")
    public void testCheckIfTheCellIsLiveAndNextToLimits(){
        Universe universe = new Universe(universeOfCell);
        assertEquals(universe.getStatusNeighbors(0,7),true);

    }



}
