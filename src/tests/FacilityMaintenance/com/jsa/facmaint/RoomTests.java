package com.jsa.facmaint;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RoomTests {

	@Test
	void test() {
		String testRoomNo = "100";
		Room r = new Room(testRoomNo);
		assertEquals(r.GetRoomNumber(), "100");
	}

}
