import domain.Cell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCell {



    @BeforeEach
    public void beforeEach(){

    }

    @Test
    @DisplayName("Test for check the status of cell")
    public void testCheckStatusOfCell(){
        Cell cell = new Cell(true);
        assertEquals(cell.isStatus(),true);
    }



}
