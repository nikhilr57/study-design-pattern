package org.study;

import org.study.game.Direction;
import org.study.game.Door;
import org.study.game.Room;
import org.study.game.Wall;

/**
 * The subclass StandardMazeBuilder is an implementation that builds simple mazes. It keeps track of
 * the maze it's building in the variable currentMaze.
 *
 */
public class StandardMazeBuilder extends MazeBuilder {

  private Maze currentMaze;

  // The StandardMazeBuilder constructor simply initializes currentMaze.
  public StandardMazeBuilder() {
    currentMaze = null;
  }

  // BuildMaze instantiates a Maze that other operations will assemble and eventually return to the
  // client (with GetMaze).
  public void buildMaze() {
    currentMaze = new Maze();
  }

  // The BuildRoom operation creates a room and builds the walls around it
  public void buildRoom(int roomNumber) {
    // First Check if room does not exists already
    // currentMaze.roomNumber(roomNumber);

    Room room = new Room(roomNumber);
    currentMaze.addRoom(room);

    room.setSide(Direction.NORTH, new Wall());
    room.setSide(Direction.EAST, new Wall());
    room.setSide(Direction.SOUTH, new Wall());
    room.setSide(Direction.WEST, new Wall());

  }

  // To build a door between two rooms, StandardMazeBuilder looks up both rooms in the maze and
  // finds their adjoining wall
  public void buildDoor(int i1, int i2) {
    Room rl = currentMaze.roomNumber(i1);
    Room r2 = currentMaze.roomNumber(i2);
    Door d = new Door(rl, r2);
    rl.setSide(commonWall(rl, r2), d);
    r2.setSide(commonWall(r2, rl), d);
  }

  public Maze getMaze() {
    return currentMaze;
  }

  // CommonWall is a utility operation that determines the direction of the common wall between two
  // rooms.
  public Direction commonWall(Room r1, Room r2) {
    return null;
  }
}
