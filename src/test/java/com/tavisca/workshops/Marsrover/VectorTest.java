package com.tavisca.workshops.Marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VectorTest {

    @Test
    void vectorInitializesWithGivenDetails(){
        Vector r = new Vector(0 ,0 , 'N');
        assertEquals(r.x(), 0);
        assertEquals(r.y(), 0);
        assertEquals('N', r.direction());
    }

    @Test
    void vectorCanRotateRightFromNorth(){
        Vector r = new Vector(10, 10, 'N');
        assertEquals('W', r.turnRight().direction());
    }

    @Test
    void vectorCanRotateRightFromWest(){
        Vector r = new Vector(10, 10, 'W');
        assertEquals('S',r.turnRight().direction());
    }

    @Test
    void vectorCanRotateRightFromSouth(){
        Vector r = new Vector(10, 10, 'S');
        assertEquals('E', r.turnRight().direction());
    }

    @Test
    void vectorCanRotateRightFromEast(){
        Vector r = new Vector(10, 10, 'E');
        assertEquals('N', r.turnRight().direction());
    }

    @Test
    void vectorCanRotateLeftFromNorth(){
        Vector r = new Vector(10, 10, 'N');
        assertEquals('W', r.turnLeft().direction());
    }

    @Test
    void vectorCanRotateLeftFromWest(){
        Vector r = new Vector(10, 10, 'W');
        assertEquals('S', r.turnLeft().direction());
    }

    @Test
    void vectorCanRotateLeftFromSouth(){
        Vector r = new Vector(10, 10, 'S');
        assertEquals('E', r.turnLeft().direction());
    }

    @Test
    void vectorCanRotateLeftFromEast(){
        Vector r = new Vector(10, 10, 'E');
        assertEquals('N', r.turnLeft().direction());
    }

    @Test
    void vectorShiftUpwardsWhenFacingNorth(){
        Vector r = new Vector(10, 10, 'N');
        assertArrayEquals(new int[]{10,11}, r.move());
    }

    @Test
    void vectorShiftDownwardsWhenFacingSouth(){
        Vector r = new Vector(10, 10, 'S');
        assertArrayEquals(new int[]{10,9}, r.move());
    }

    @Test
    void vectorShiftRightwardsWhenFacingEast(){
        Vector r = new Vector(10, 10, 'E');
        assertArrayEquals(new int[]{11,10}, r.move());
    }

    @Test
    void vectorShiftLeftwardsWhenFacingWest(){
        Vector r = new Vector(10, 10, 'W');
        assertArrayEquals(new int[]{9,10}, r.move());
    }
}
