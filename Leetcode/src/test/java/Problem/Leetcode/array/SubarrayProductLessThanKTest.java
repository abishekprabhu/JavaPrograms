package Problem.Leetcode.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubarrayProductLessThanKTest {
		private final SubarrayProductLessThanK solution = new SubarrayProductLessThanK();
	@Test
    public void testNumSubarrayProductLessThanK() {
        

        // Test case 1: nums = {10, 5, 2, 6}, k = 100
        int[] nums1 = {10, 5, 2, 6};
        int k1 = 100;
        int expected = 8;
        int result = solution.numSubarrayProductLessThanK(nums1, k1);
        assertEquals(expected, result);

        // Test case 2: nums = {1, 2, 3}, k = 0
        int[] nums2 = {1, 2, 3};
        int k2 = 0;
        assertEquals(0, solution.numSubarrayProductLessThanK(nums2, k2));

        // Test case 3: nums = {1, 1, 1, 1}, k = 2
        int[] nums3 = {1, 1, 1, 1};
        int k3 = 2;
        assertEquals(10, solution.numSubarrayProductLessThanK(nums3, k3));

        
        // Add more test cases as needed
    }

}
