package org.study;

import java.util.Arrays;

public class Room implements MapSite {


	private int roomNumber;
	private MapSite[] sides = new MapSite[4];

	public Room(int roomNumber) {

	}


	public MapSite getSide(Direction direction) {
		return null;
	}

	public void setSide(Direction direction, MapSite mazeSite) {

	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", sides=" + Arrays.toString(sides) + "]";
	}
}
