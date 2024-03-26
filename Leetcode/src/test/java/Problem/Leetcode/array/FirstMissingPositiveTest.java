package Problem.Leetcode.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstMissingPositiveTest {

	 @Test
	    public void testFirstMissingPositive() {
	        FirstMissingPositive fmp = new FirstMissingPositive();
	        
	        // Test case 1
	        int[] nums1 = {1, 2, 0};
	        assertEquals(3, fmp.firstMissingPositive(nums1));
	        
	        // Test case 2
	        int[] nums2 = {3, 4, -1, 1};
	        assertEquals(2, fmp.firstMissingPositive(nums2));
	        
	        // Test case 3
	        int[] nums3 = {7, 8, 9, 11, 12};
	        assertEquals(1, fmp.firstMissingPositive(nums3));
	        
	     // Test case 4: Empty array, should throw IllegalArgumentException
	        int[] nums4 = {};
	        assertThrows(IllegalArgumentException.class, () -> fmp.firstMissingPositive(nums4));
	        
	        // Test case 5: All positive numbers from 1 to n are present, next missing positive is n + 1
	        int[] nums5 = {1, 2, 3, 4, 5};
	        assertEquals(6, fmp.firstMissingPositive(nums5));
	    }

}
