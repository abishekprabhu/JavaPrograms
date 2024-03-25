package Problem.Leetcode.array;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindAllDuplicatesInAnArrayTest {

	 @Test
	    public void testFindDuplicates() {
		 	FindAllDuplicatesInAnArray solution = new FindAllDuplicatesInAnArray();

	        // Test case 1
	        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
	        List<Integer> expected1 = Arrays.asList(2, 3);
	        assertEquals(expected1, solution.findDuplicates(nums1));

	        // Test case 2
	        int[] nums2 = {1, 1, 2};
	        List<Integer> expected2 = Arrays.asList(1);
	        assertEquals(expected2, solution.findDuplicates(nums2));

	        // Test case 3
	        int[] nums3 = {1};
	        List<Integer> expected3 = Arrays.asList();
	        assertEquals(expected3, solution.findDuplicates(nums3));

	        // Test case 4
	        int[] nums4 = {10, 2, 5, 10, 9, 1, 1, 4, 3, 7};
	        List<Integer> expected4 = Arrays.asList(10, 1);
	        assertEquals(expected4, solution.findDuplicates(nums4));
	    }

}
