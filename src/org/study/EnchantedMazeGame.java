package org.study;

import org.study.game.Door;
import org.study.game.DoorNeedingSpell;
import org.study.game.EnchantedRoom;
import org.study.game.Room;
import org.study.game.Spell;

public class EnchantedMazeGame extends MazeGame {


  public EnchantedMazeGame() {}

  @Override
  public Room makeRoom(int n) {
    return new EnchantedRoom(n);
  }

  @Override
  public Door makeDoor(Room rl, Room r2) {
    return new DoorNeedingSpell(rl, r2);
  }

  public Spell castSpell() {
    return new Spell();
  }

}
