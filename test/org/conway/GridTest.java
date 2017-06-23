package org.conway;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jodiegarden on 23/06/2017.
 */
public class GridTest {

    @Test
    public void GridHasXCoord(){
        Grid grid = new Grid(3,3);
        assertEquals(3,grid.X);
    }

    @Test
    public void GridHasYCoord(){
        Grid grid = new Grid(3,3 );
        assertEquals(3, grid.Y);
    }

    @Test
    public void GridContainsLiveCellAtGenerationX(){
        Grid grid = new Grid(3,3);
        assertTrue(grid.ContainsLivingCells());
    }

}
