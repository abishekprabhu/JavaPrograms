package Problem.Leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountSubarraysWhereMaxELementAppearsAtLeastKTimesTest {

    @Test
    public void testCountSubarrays() {
        CountSubarraysWhereMaxELementAppearsAtLeastKTimes solution = new CountSubarraysWhereMaxELementAppearsAtLeastKTimes();

        // Test case 1: nums = [30238, 58590, 61199, 49182, 53404, 51537, 30143, 49693, 46815, 12779, 61199, 16063, 37155, 1535, 24283, 11082, 61199, 58184, 61199, 61199, 61199, 61199, 61199, 61199, 21155, 61199, 25521, 32684, 54811, 31845, 58906, 61199, 61199, 14980, 43454, 61199, 22257, 34418, 57353, 4149, 60297, 10768, 61199, 8178, 56488, 61199, 27177, 38719, 43366, 55343, 61199, 61199, 61199, 20289, 40588, 61199, 52451, 23879, 55352, 40263, 61199, 61199, 57086, 59190, 31339, 11305, 48391], k = 6282
//        int[] nums1 = {30238, 58590, 61199, 49182, 53404, 51537, 30143, 49693, 46815, 12779, 61199, 16063, 37155, 1535, 24283, 11082, 61199, 58184, 61199, 61199, 61199, 61199, 61199, 61199, 21155, 61199, 25521, 32684, 54811, 31845, 58906, 61199, 61199, 14980, 43454, 61199, 22257, 34418, 57353, 4149, 60297, 10768, 61199, 8178, 56488, 61199, 27177, 38719, 43366, 55343, 61199, 61199, 61199, 20289, 40588, 61199, 52451, 23879, 55352, 40263, 61199, 61199, 57086, 59190, 31339, 11305, 48391};
//        int k1 = 6282;
//        long expectedOutput1 = 2815068166L; // Use long type
//        assertEquals(expectedOutput1, solution.countSubarrays(nums1, k1));

        // Test case 2: nums = [1, 4, 2, 1], k = 3
        int[] nums2 = {1, 4, 2, 1};
        int k2 = 3;
        assertEquals(0, solution.countSubarrays(nums2, k2));

        // Test case 3: nums = [1, 3, 2, 3, 3], k = 2
        int[] nums3 = {1, 3, 2, 3, 3};
        int k3 = 2;
        assertEquals(6, solution.countSubarrays(nums3, k3));

        // Add more test cases as needed
    }
}
