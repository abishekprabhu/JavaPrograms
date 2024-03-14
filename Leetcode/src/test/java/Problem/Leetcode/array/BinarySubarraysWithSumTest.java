package Problem.Leetcode.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySubarraysWithSumTest {
		private final BinarySubarraysWithSum testObject = new BinarySubarraysWithSum();
	@Test
	public void test() {
		
	        
	        int[] nums = {1, 0, 1, 0, 1};
	        int goal = 2;
	        int expected = 4;
	        int result = testObject.numSubarraysWithSum(nums, goal);
	        assertEquals(expected, result);
	        
	    
	}
	
	@Test
	public void test1() {
		
	        
	        int[] nums = {0, 0, 0, 0, 0};
	        int goal = 0;
	        int expected = 15;
	        int result = testObject.numSubarraysWithSum(nums, goal);
	        assertEquals(expected, result);
	        
	    
	}

}
