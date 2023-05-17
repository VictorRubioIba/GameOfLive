import domain.Cell;
import domain.Universe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestUniverse {

    boolean[][] universeOfCell= new boolean[8][8];
    Universe universe = new Universe(universeOfCell);


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

        assertEquals(universe.getStatusNeighbors(4,2),false);

    }
    @Test
    @DisplayName("Test for check cell is live and two neighbors are live")
    public void testCheckIfTwoNeighbordsAreLive(){

        assertEquals(universe.getStatusNeighbors(2,2),true);

    }
    @Test
    @DisplayName("Test for check cell is live and three neighbors are live")
    public void testCheckIfThreeNeighbordsAreLive(){

        assertEquals(universe.getStatusNeighbors(4,4),true);

    }
    @Test
    @DisplayName("Test for check cell is live and three neighbors is live")
    public void testCheckIfGreaterThreeNeighbordsAreLive(){

        assertEquals(universe.getStatusNeighbors(4,6),false);

    }
    @Test
    @DisplayName("Test for check cell is died and three neighbors is live")
    public void testCheckIfThreeNeighbordsAreLiveAndCellDied(){

        assertEquals(universe.getStatusNeighbors(5,5),false);

    }

    @Test
    @DisplayName("Test for check cell is live and is next to limits")
    public void testCheckIfTheCellIsLiveAndNextToLimits(){

        assertEquals(universe.getStatusNeighbors(0,7),true);

    }
    @Test
    @DisplayName("Test for check cell is live and is next to limits")
    public void testCheckIfTheCellIsLiveAndNextToLimitsRight(){

        assertEquals(universe.getStatusNeighbors(7,7),false);

    }



}
