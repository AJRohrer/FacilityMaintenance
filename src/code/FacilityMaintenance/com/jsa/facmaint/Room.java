package com.jsa.facmaint;

import java.util.ArrayList;

public class Room extends Facility{
	private String _roomNumber = "";
	
	public Room(String RoomNumber, boolean isUnderMaint, double maintCost, double ageMonths, ArrayList<Problem> problemList, String description) {
		super(RoomNumber, isUnderMaint, maintCost, ageMonths, problemList, description);
		_roomNumber = RoomNumber;
	}
	
	public String GetRoomNumber() {
		return _roomNumber;
	}
}
