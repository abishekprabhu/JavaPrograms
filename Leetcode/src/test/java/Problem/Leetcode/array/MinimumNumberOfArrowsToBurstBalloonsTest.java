package Problem.Leetcode.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinimumNumberOfArrowsToBurstBalloonsTest {

	 @Test
	    public void testFindMinArrowShots() {
	        MinimumNumberOfArrowsToBurstBalloons solution = new MinimumNumberOfArrowsToBurstBalloons();

	        // Test case 1
	        int[][] points1 = {{10,16}, {2,8}, {1,6}, {7,12}};
	        int expected1 = 2;
	        assertEquals(expected1, solution.findMinArrowShots(points1));

	        // Test case 2
	        int[][] points2 = {{1,2}, {3,4}, {5,6}, {7,8}};
	        int expected2 = 4;
	        assertEquals(expected2, solution.findMinArrowShots(points2));

	        // Test case 3
	        int[][] points3 = {{1,2}, {2,3}, {3,4}, {4,5}};
	        int expected3 = 2;
	        assertEquals(expected3, solution.findMinArrowShots(points3));
	    }
}
