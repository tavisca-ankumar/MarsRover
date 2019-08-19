package com.tavisca.workshops.Marsrover;

public class RunRover {
    static int[] position = new int[2];
    public static Vector controlRover(Vector rover, String key){
        switch (key){
            case "m": case "M": position = rover.move();
                break;
            case "l": case "L": rover = rover.turnLeft();
                break;
            case "r": case "R": rover = rover.turnRight();
                break;
            case "d": case "D":
                System.out.println("(x, y) ->   ("+position[0]+", "+position[1]+")");
                System.out.println("direction -> "+rover.direction());
                break;
            default: break;
        }
        return rover;
    }

    public static void main(String[] args) {
        System.out.println("You are controlling the rover here:");
        System.out.println("Press m/M to MOVE");
        System.out.println("Press l/L to LEFT");
        System.out.println("Press r/R to RIGHT");
        System.out.println("Press d/D to SHOW DIRECTION");
        System.out.println("Press e/E to STOP and EXIT");
        Vector rover = new Vector(0, 0, 'E');
        System.out.println("Current Position of Rover is: ");
        controlRover(rover, "d");
        System.out.println();
//        String key = "";
//        while (!key.equals("e")){
//            key = scan.next();
//            rover = controlRover(rover, key);
//        }
        System.out.println("Say good bye to Rover");
    }
}