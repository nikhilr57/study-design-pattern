package org.study;

import org.study.game.Door;
import org.study.game.DoorNeedingSpell;
import org.study.game.EnchantedRoom;
import org.study.game.Room;
import org.study.game.Spell;

public class EnchantedMazeFactory extends MazeFactory {

	public EnchantedMazeFactory() {
	}

	public Room makeRoom(int roomNumber) {
		return new EnchantedRoom(roomNumber);
	}

	public Door makeDoor(Room room1, Room room2) {
		return new DoorNeedingSpell(room1, room2);
	}

	public Spell castSpell() {
		return null;
	}
}
