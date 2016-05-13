package doors;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDoors {

	@Test
	public void test() {
		assertEquals("closed", CheckDoors.checkDoor(0,1));
		assertEquals("closed", CheckDoors.checkDoor(0,2));
		assertEquals("closed", CheckDoors.checkDoor(0,17));
	}
	@Test
	public void test1() {
		assertEquals("open", CheckDoors.checkDoor(1,1));
		assertEquals("open", CheckDoors.checkDoor(1,2));
		assertEquals("open", CheckDoors.checkDoor(1,3));
	}
	@Test
	public void test2() {
		assertEquals("open", CheckDoors.checkDoor(2,1));
		assertEquals("closed", CheckDoors.checkDoor(2,2));
		assertEquals("closed", CheckDoors.checkDoor(2,4));
	}
	@Test
	public void test3final() {
		assertEquals("open", CheckDoors.checkDoor(3,6));
		assertEquals("open", CheckDoors.checkDoor(5,15));
		assertEquals("open", CheckDoors.checkDoor(6,24));
	}
}
