package org.study;

import org.study.game.Direction;

/**
 * A more exotic MazeBuilder is CountingMazeBuilder. This builder doesn't create a maze at all;
 * it just counts the different kinds of components that would have been created.
 */
public class CountingMazeBuilder extends MazeBuilder {

  int doors;
  int rooms;

  public CountingMazeBuilder() {
    rooms = doors = 0;
  }

  // Fill references, pass by reference
  void getCount(Integer doors, Integer rooms) {
    doors = this.doors;
    rooms = this.rooms;
  }

  void BuildMaze() {

  }

  void BuildRoom(int i) {
    rooms++;
  }

  void BuildDoor(int i1, int i2) {
    doors++;
  }


  void AddWall(int i, Direction direction) {}
}
