package org.study;

import org.study.game.Door;
import org.study.game.Room;
import org.study.game.Wall;

/**
 * Class Maze Factory can create components of mazes . It builds rooms, walls, and doors between
 * rooms. It might be used by a program that reads plans for mazes from a file and builds the
 * corresponding maze. O r it might be used by a program that builds mazes randomly. Programs that
 * build mazes take a M azeFactory as an argument so that the programmer can specify the classes of
 * rooms, walls, and doors to construct.
 *
 * MazeFactory is not an abstract class; thus it acts as both the AbstractFactory and the
 * ConcreteFactory.
 */
public class MazeFactory {

  public MazeFactory() {

  }

  public Maze makeMaze() {
    return new Maze();
  }

  public Wall makeWall() {
    return new Wall();
  }

  public Room makeRoom(int roomNumber) {
    return new Room(roomNumber);
  }

  public Door makeDoor(Room room1, Room room2) {
    return new Door(room1, room2);
  }
}
