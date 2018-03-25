package org.study.game;

public class RoomWithABomb extends Room {

  public RoomWithABomb(int roomNumber) {
    super(roomNumber);
  }

  @Override
  public String toString() {
    return "RoomWithABomb [toString()=" + super.toString() + "]";
  }
}
