package org.study;

import org.study.game.Door;
import org.study.game.DoorNeedingSpell;
import org.study.game.EnchantedRoom;
import org.study.game.Room;
import org.study.game.Spell;

/**
 * We can create EnchantedMazeFactory, a factory for enchanted mazes, by sub-classing MazeFactory.
 * EnchantedMazeFactory will override different member functions and return different subclasses of
 * Room, Wall , etc.
 *
 */
public class EnchantedMazeFactory extends MazeFactory {

  public EnchantedMazeFactory() {}

  @Override
  public Room makeRoom(int roomNumber) {
    return new EnchantedRoom(roomNumber);
  }

  @Override
  public Door makeDoor(Room room1, Room room2) {
    return new DoorNeedingSpell(room1, room2);
  }

  public Spell castSpell() {
    return null;
  }
}
