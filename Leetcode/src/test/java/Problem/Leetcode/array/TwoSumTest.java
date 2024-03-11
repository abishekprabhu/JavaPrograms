package Problem.Leetcode.array;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;


public class TwoSumTest {
	private final TwoSum testObject = new TwoSum();
	
	@Test
	public void testTwoSum() {
		int nums[] = new int[] {2,7,11,15};
		int target =9;
		int[] expected = new int[] {0,1};
		assertArrayEquals(expected, testObject.twoSum(nums, target));
		nums = new int[]{3, 2, 4};
        target = 6;
        expected = new int[]{1, 2};
        assertArrayEquals(expected, testObject.twoSum(nums, target));

        nums = new int[]{3, 3};
        expected = new int[]{0, 1};
        assertArrayEquals(expected, testObject.twoSum(nums, target));
	}
}
