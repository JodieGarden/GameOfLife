package org.conway;

/**
 * Created by jodiegarden on 23/06/2017.
 */
public class Cell {

        boolean alive;

        public Cell tick(int numberOfNeighbours) {
           Cell next = new Cell();

           if( numberOfNeighbours < 2 || numberOfNeighbours > 3){
               next.alive = false;
           }else{
               next.alive = true;
           }
           return next;
        }

        public boolean isAlive(){
            return alive;
        }
    }


