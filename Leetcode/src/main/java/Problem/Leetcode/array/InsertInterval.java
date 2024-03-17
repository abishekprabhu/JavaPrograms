package Problem.Leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
	public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
       int i = 0;
       int n = intervals.length;
       
       // Add intervals before newInterval
       while (i < n && intervals[i][1] < newInterval[0]) {
           result.add(intervals[i]);
           i++;
       }
       
       // Merge overlapping intervals with newInterval
       while (i < n && intervals[i][0] <= newInterval[1]) {
           newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
           newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
           i++;
       }
       result.add(newInterval);
       
       // Add remaining intervals after newInterval
       while (i < n) {
           result.add(intervals[i]);
           i++;
       }
       
       return result.toArray(new int[result.size()][]);
   }
}
