package org.conway;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jodiegarden on 23/06/2017.
 */
public class CellTest {
    @Test
    public void whenCellCreated_IsValidObject(){
        Cell cell = new Cell();
        assertNotNull(cell);

    }
    @Test
    public void DeadCell_WhenThreeNeighbours_AliveNextGeneration(){
        Cell deadCell = new Cell();
        Cell nextGeneration = deadCell.tick(3);
        assertTrue(nextGeneration.isAlive());
    }

    @Test
    public void DeadCell_WhenTwoNeighbours_DeadInNextGen(){
        Cell deadCell = new Cell();
        Cell nextGeneration = deadCell.tick(1);
        assertFalse(nextGeneration.isAlive());
    }

    @Test
    public void DeadCell_WhenMoreThanThreeNeighbours_DeadInNextGen(){
        Cell deadCell = new Cell();
        Cell nextGeneration = deadCell.tick(4);
        assertFalse(nextGeneration.isAlive());
    }

    @Test
    public void DeadCellAlive_WithExactlyThreeLiveNeighbours_AliveNextGen(){
        Cell deadCell = new Cell();
        Cell nextGeneration = deadCell.tick(3);
        assertTrue(nextGeneration.isAlive());
    }

}
