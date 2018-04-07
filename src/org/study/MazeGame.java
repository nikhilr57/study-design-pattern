package org.study;

import org.study.game.Direction;
import org.study.game.Door;
import org.study.game.Room;
import org.study.game.Wall;

public class MazeGame {


  public Maze createMaze() {

    Maze aMaze = makeMaze();
    Room r1 = makeRoom(1);
    Room r2 = makeRoom(2);

    Door door1 = makeDoor(r1, r2);
    aMaze.addRoom(r1);
    aMaze.addRoom(r2);

    r1.setSide(Direction.NORTH, makeWall());
    r1.setSide(Direction.EAST, door1);
    r1.setSide(Direction.SOUTH, makeWall());
    r1.setSide(Direction.WEST, makeWall());

    r2.setSide(Direction.NORTH, makeWall());
    r2.setSide(Direction.EAST, makeWall());
    r2.setSide(Direction.SOUTH, makeWall());
    r2.setSide(Direction.WEST, door1);

    return aMaze;
  }

  // factory methods:
  public Maze makeMaze() {
    return new Maze();
  }

  // factory methods:
  public Room makeRoom(int roomNumber) {
    return new Room(roomNumber);
  }

  // factory methods:
  public Wall makeWall() {
    return new Wall();
  }

  // factory methods:
  public Door makeDoor(Room r1, Room r2) {
    return new Door(r1, r2);
  }
}
