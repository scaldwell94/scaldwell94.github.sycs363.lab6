package howard.edu.sycs363.spring15.lab3;

import static org.junit.Assert.*;

/**
 * Tests each method to make sure they are functioning properly
 * @author		Sydny Caldwell
 * @version		%I%, %G%
 * @param test	the instance of IntegerArrayList that is used to call methods
 */

import org.junit.Test;

public class IntegerArrayListTest extends IntegerArrayList {

	@Test
	public void testIntegerArrayList() {
		
	}

	@Test
	public void testIntegerArrayListInt() {
		
	}

	@Test
	public void testAddInt() {
		IntegerArrayList test = new IntegerArrayList();
		test.Add(10);
		
		//Tests
		assertEquals("Should return 10", 10, test.Get(0));
	}

	@Test
	public void testAddIntInt() {
		IntegerArrayList test = new IntegerArrayList();
		test.Add(0, 10);
		
		//Tests
		assertEquals("Should return 10", 10, test.Get(0));
 	}

	@Test
	public void testGet() {
		IntegerArrayList test = new IntegerArrayList();
		test.Get(0);
		
		//Tests
		assertEquals("Should return -1", -1, test.Get(0));
	}

	@Test
	public void testIndexOf() {
		IntegerArrayList test = new IntegerArrayList();
		test.Add(7);
		
		//Tests
		assertEquals("Should return 0", 0, test.IndexOf(7));
	}

	@Test
	public void testIsEmpty() {
		IntegerArrayList test = new IntegerArrayList();
		
		//Tests
		assertTrue(test.isEmpty());
	}

	@Test
	public void testRemove() {
		IntegerArrayList test = new IntegerArrayList();
		test.Add(7);
		
		//Tests
		assertEquals("Should return 7", 7, test.Remove(0));
	}

}
