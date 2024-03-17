package Problem.Leetcode.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertIntervalTest {
    
    @Test
    public void testInsert() {
        InsertInterval insertInterval = new InsertInterval();
        
        // Test case 1
        int[][] intervals1 = {{1,3},{6,9}};
        int[] newInterval1 = {2,5};
        int[][] expected1 = {{1,5},{6,9}};
        assertArrayEquals(expected1, insertInterval.insert(intervals1, newInterval1));
        
        // Test case 2
        int[][] intervals2 = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval2 = {4,8};
        int[][] expected2 = {{1,2},{3,10},{12,16}};
        assertArrayEquals(expected2, insertInterval.insert(intervals2, newInterval2));
        
        // Additional test case
        int[][] intervals3 = {{1,5}};
        int[] newInterval3 = {2,3};
        int[][] expected3 = {{1,5}};
        assertArrayEquals(expected3, insertInterval.insert(intervals3, newInterval3));
    }
}