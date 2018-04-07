package org.study;

import org.study.game.BombedWall;
import org.study.game.Room;
import org.study.game.RoomWithABomb;
import org.study.game.Wall;

public class BombedMazeGame extends MazeGame {

  public BombedMazeGame() {

  }

  @Override
  public Wall makeWall() {
    return new BombedWall();
  }

  @Override
  public Room makeRoom(int roomNumber) {
    return new RoomWithABomb(roomNumber);
  }

}
