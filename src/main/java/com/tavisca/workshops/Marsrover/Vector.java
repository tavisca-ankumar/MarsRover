package com.tavisca.workshops.Marsrover;

import java.util.HashMap;

public class Vector {
    private int x,y;
    private final char direction;

    private static HashMap<Character, Character> leftMap
            = new HashMap<>(){{
                put('N','W');
                put('W','S');
                put('S','E');
                put('E','N');
    }};

    private static HashMap<Character, Character> rightMap
            = new HashMap<>(){{
        put('N','E');
        put('E','S');
        put('S','W');
        put('W','N');
    }};

    public Vector(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    public char direction() {
        return direction;
    }

    public Vector turnLeft() {
        return new Vector(this.x, this.y, leftMap.get(this.direction));
    }

    public Vector turnRight() {
        return new Vector(this.x, this.y, leftMap.get(this.direction));
    }

    public int[] move() {
        switch(direction){
            case 'E': x++; break;
            case 'N': y++; break;
            case 'S': y--; break;
            case 'W': x--; break;
        }
        return new int[]{x,y};
    }
}
