package com.tavisca.workshops.Marsrover;

public class Coordinate {
    int x = 0;
    int y = 0;
    public int getXCoordinate(){
        return x;
    }
    public int getYCoordinate(){
        return y;
    }

    public void incrementXCordinate(){
        x++;
    }

    public void incrementYCordinate(){
        y++;
    }

    public void decrementXCordinate(){
        x--;
    }

    public void decrementYCordinate(){
        y--;
    }
}
