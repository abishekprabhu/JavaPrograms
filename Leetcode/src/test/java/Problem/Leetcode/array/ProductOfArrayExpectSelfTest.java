package Problem.Leetcode.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductOfArrayExpectSelfTest {

	@Test
    public void testProductExceptSelf() {
        ProductOfArrayExpectSelf testObject = new ProductOfArrayExpectSelf();
        
        // Test Case 1
        int[] nums1 = {1, 2, 3, 4};
        int[] expected1 = {24, 12, 8, 6};
        assertArrayEquals(expected1, testObject.productExceptSelf(nums1));

        // Test Case 2
        int[] nums2 = {4, 3, 2, 1};
        int[] expected2 = {6, 8, 12, 24};
        assertArrayEquals(expected2, testObject.productExceptSelf(nums2));

        // Additional Test Case
        int[] nums3 = {1, 1, 1, 1};
        int[] expected3 = {1, 1, 1, 1};
        assertArrayEquals(expected3, testObject.productExceptSelf(nums3));
    }

}
