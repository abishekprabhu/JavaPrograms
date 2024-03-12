package Problem.Leetcode.String;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumOddBinaryNumberTest {
	
	private final MaximumOddBinaryNumber testObject = new MaximumOddBinaryNumber();
	
	@Test
	public void testMaximumOddBinaryNumber() {
		// Test case input
		String input1 = "010";
		// Expected output
		String expected1 = "001";
		// Actual output
		String actual1 = testObject.maximumOddBinaryNumber(input1);
		// Compare with expected output
		assertEquals(expected1, actual1);
		//I try to test this case assertEquals line showing an error but the code is working fine 
		// Test case input
		String input2 = "10101";
		// Expected output
		String expected2 = "11110";
		// Actual output
		String actual2 = testObject.maximumOddBinaryNumber(input2);
		// Compare with expected output
		assertEquals(expected2, actual2);
	}
}
