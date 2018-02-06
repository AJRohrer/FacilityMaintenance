package com.jsa.facmaint;

import java.util.ArrayList;

public abstract class Facility {
	ArrayList<Room> _rooms = new ArrayList<Room>();
	//TODO -> Add calendar object to constructor when we know what that will be.
	public Facility(String RoomNumber, boolean isUnderMaint, double maintCost, double ageMonths, ArrayList<Problem> problemList, String description) {
		_rooms.add(new Room(RoomNumber, isUnderMaint, MaintCost, ageMonths, problemList, description));
	}
	
	public Facility(Address a, ) {
		
	}
}
