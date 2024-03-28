package Problem.Leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LengthOfLongestSubarrayWithAtMostKFrequencyTest {

    @Test
    public void testMaxSubarrayLength() {
        LengthOfLongestSubarrayWithAtMostKFrequency solution = new LengthOfLongestSubarrayWithAtMostKFrequency();

        // Test case 1: nums = {1, 2, 1, 2, 3}, k = 2
        int[] nums1 = {1, 2, 3, 1, 2, 3 ,1 , 2 };
        int k1 = 2;
        assertEquals(6, solution.maxSubarrayLength(nums1, k1));

        // Test case 2: nums = {1, 2, 1, 2, 3}, k = 1
        int[] nums2 = {1, 2, 1, 2, 3};
        int k2 = 1;
        assertEquals(3, solution.maxSubarrayLength(nums2, k2));

        // Test case 3: nums = {1, 1, 1, 1, 1}, k = 1
        int[] nums3 = {1, 1, 1, 1, 1};
        int k3 = 1;
        assertEquals(1, solution.maxSubarrayLength(nums3, k3));

        // Test case 4: nums = {1, 2, 3, 4, 5}, k = 3
        int[] nums4 = {1, 2, 3, 4, 5};
        int k4 = 3;
        assertEquals(5, solution.maxSubarrayLength(nums4, k4));

        // Add more test cases as needed
    }
}