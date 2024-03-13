package Problem.Leetcode.Math;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindThePivotIntegerTest {
	
	private final FindThePivotInteger testObject = new FindThePivotInteger();
	@Test
	public void testPivotInteger() {
		int input = 1;
		int expected = 1;
		
		assertEquals(expected, testObject.pivotInteger(input));
	}
	
	
	@Test
	public void testPivotInteger1() {
		int input = 8;
		int expected = 6;
		
		assertEquals(expected, testObject.pivotInteger(input));
	}
	
	@Test
	public void testPivotInteger2() {
		int input = 4;
		int expected = -1;
		
		assertEquals(expected, testObject.pivotInteger(input));
	}
	

}
