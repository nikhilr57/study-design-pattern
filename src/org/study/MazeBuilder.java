package org.study;

/**
 * This interface can create three things: (1) the maze, (2) rooms with a particular room number,
 * and (3) doors between numbered rooms. The GetMaze operation returns the maze to the client.
 * Subclasses of MazeBuilder will override this operation to return the maze that they build. All
 * the maze-building operations do nothing by default. They're not declared pure virtual to let
 * derived classes override only those methods in which they're interested.
 */

public class MazeBuilder {

  public MazeBuilder() {

  }

  public void buildMaze() {

  }

  public void buildRoom(int roomNumber) {

  }

  // These are room numbers, and not room objects itself
  public void buildDoor(int i1, int i2) {

  }

  public Maze getMaze() {
    return null;
  }
}
