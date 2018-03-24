package org.study;

public class Door implements MapSite {

	private Room room1;
	private Room room2;
	private boolean open;

	// Door between two rooms
	public Door(Room room1, Room room2) {

	}

	public Room otherSideFrom(Room room) {
		return null;
	}

	public boolean isOpen() {
		return open;
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Door [room1=" + room1 + ", room2=" + room2 + ", open=" + open + "]";
	}

}
