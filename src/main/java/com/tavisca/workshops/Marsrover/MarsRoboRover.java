package com.tavisca.workshops.Marsrover;

public class MarsRoboRover {
	Coordinate roverCoordinate;
	private static Direction dir;
	Command command;
	String defaultPosition = "3 3 E";
	String currentPosition;

	MarsRoboRover(){
		this.currentPosition = this.defaultPosition;
		String[] positions = currentPosition.split(" ");
		roverCoordinate = new Coordinate();
		roverCoordinate.x = Integer.valueOf(positions[0]);
		roverCoordinate.y = Integer.valueOf(positions[1]);
		this.dir = StartingDirection(positions[2]);
	}

	MarsRoboRover(String currentPosition){
		this.currentPosition = currentPosition;
		String[] positions = currentPosition.split(" ");
		roverCoordinate = new Coordinate();
		roverCoordinate.x = Integer.valueOf(positions[0]);
		roverCoordinate.y = Integer.valueOf(positions[1]);
		this.dir = StartingDirection(positions[2]);
	}

	private static Direction StartingDirection(String direction) {
		switch (direction) {
			case "N": dir = Direction.NORTH;break;
			case "W": dir = Direction.WEST;break;
			case "S": dir = Direction.SOUTH;break;
			case "E": dir = Direction.EAST;break;
		}
		return dir;
	}

	private static char EndingDirection(Direction direction) {
		switch (direction) {
			case NORTH: return 'N';
			case WEST: return 'W';
			case SOUTH: return 'S';
			case EAST: return 'E';
			default: return '1';
		}
	}

	public void roveUsingCommands(String commands){
		for (char command : commands.toCharArray()) {
			rove(getInstruction(command));
		}
	}

	public Command getInstruction(char com){
		switch (com) {
			case 'L': command = Command.LEFT;break;
			case 'M': command = Command.MOVE;break;
			case 'R': command = Command.RIGHT;break;
		}
		return command;
	}

	public static void main(String[] args) {

		String commands = "MMRMMRMRRM";
		MarsRoboRover mrr = new MarsRoboRover();
		System.out.println("currentPosition..." + mrr.currentPosition);
		System.out.println("commands..." + commands);
		mrr.roveUsingCommands(commands);
		System.out.println("newPosition..." + mrr.roverCoordinate.getXCoordinate() + " " + mrr.roverCoordinate.getYCoordinate() + " " + mrr.EndingDirection(mrr.dir));
	}

	private  void rove(Command command) {
		switch (command) {
			case LEFT:
				turnLeft();
				break;
			case RIGHT:
				turnRight();
				break;
			case MOVE:
				move();
				break;
		}
	}

	private void turnLeft() {
		switch (dir) {
			case EAST: dir = Direction.NORTH; break;
			case NORTH: dir = Direction.WEST; break;
			case SOUTH: dir = Direction.EAST; break;
			case WEST: dir = Direction.SOUTH; break;
		}
	}

	private void turnRight() {
		switch (dir) {
			case EAST: dir = Direction.SOUTH; break;
			case NORTH: dir = Direction.EAST; break;
			case SOUTH: dir = Direction.WEST; break;
			case WEST: dir = Direction.NORTH; break;
		}
	}

	private void move() {
		switch (dir) {
			case EAST: roverCoordinate.incrementXCordinate(); break;
			case NORTH: roverCoordinate.incrementYCordinate(); break;
			case SOUTH: roverCoordinate.decrementYCordinate(); break;
			case WEST: roverCoordinate.decrementXCordinate(); break;
		}
	}

}
