package org.study.game;

public class DoorNeedingSpell extends Door {

	public DoorNeedingSpell(Room room1, Room room2) {
		super(room1, room2);
	}

	@Override
	public String toString() {
		return "DoorNeedingSpell [toString()=" + super.toString() + "]";
	}

}
