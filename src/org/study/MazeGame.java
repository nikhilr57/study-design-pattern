package org.study;

import org.study.game.Direction;
import org.study.game.Door;
import org.study.game.Room;

public class MazeGame {

	public static void main(String[] args) {

	}

	public Maze createGame() {
		createMaze(new MazeFactory());
		createMaze(new EnchantedMazeFactory());		
		return null;
	}
	
	public MazeGame createMaze(MazeFactory factory) {

		Maze aMaze = factory.makeMaze();
		Room r1 = factory.makeRoom(1);
		Room r2 = factory.makeRoom(2);
		Door door = factory.makeDoor(r1, r2);

		aMaze.addRoom(r1);
		aMaze.addRoom(r2);

		r1.setSide(Direction.NORTH, factory.makeWall());
		r1.setSide(Direction.EAST, door);
		r1.setSide(Direction.SOUTH, factory.makeWall());
		r1.setSide(Direction.WEST, factory.makeWall());

		r2.setSide(Direction.NORTH, factory.makeWall());
		r2.setSide(Direction.EAST, door);
		r2.setSide(Direction.SOUTH, factory.makeWall());
		r2.setSide(Direction.WEST, factory.makeWall());


		return null;
	}

}
