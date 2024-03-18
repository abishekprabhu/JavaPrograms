package Problem.Leetcode.array;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrowsToBurstBalloons {
	public int findMinArrowShots(int[][] points) {
		
		// Sorting the array of points based on the start position of each interval
        Arrays.sort(points, Comparator.comparingInt(point -> point[0]));

        // Initialize the number of arrows required to 1
        int arrows = 1;

        // Initialize the end position of the first interval
        int end = points[0][1];

        // Iterate through each interval starting from the second one
        for (int i = 1; i < points.length; i++) {

            // Get the start and end positions of the current interval
            int currentStart = points[i][0];
            int currentEnd = points[i][1];

            // If the end position of the previous interval is less than the start position of the current interval,
            // increment the number of arrows required and update the end position to the end position of the current interval
            if (end < currentStart) {
                arrows++;
                end = currentEnd;
            }
            // If there is an overlap between the current interval and the previous interval,
            // update the end position to the minimum of the current end position and the previous end position
            else {
                end = Math.min(end, currentEnd);
            }
        }
        return arrows;
	}
}
