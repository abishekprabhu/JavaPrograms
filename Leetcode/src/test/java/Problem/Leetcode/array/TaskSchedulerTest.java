package Problem.Leetcode.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskSchedulerTest {
	private final TaskScheduler testObject = new TaskScheduler();
	@Test
    public void testLeastInterval_Example1() {     
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        int expected = 8; // Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.
        int result = testObject.leastInterval(tasks, n);
        assertEquals(expected, result);
    }
	
	@Test
    public void testLeastInterval_Example2() {
        TaskScheduler scheduler = new TaskScheduler();
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 1;
        int expected = 6; // Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.
        int result = scheduler.leastInterval(tasks, n);
        assertEquals(expected, result);
    }
	
	@Test
    public void testLeastInterval_Example3() {
        TaskScheduler scheduler = new TaskScheduler();
        char[] tasks = {'A', 'A', 'B', 'B', 'C', 'C', 'D', 'D'};
        int n = 2;
        int expected = 8; // Explanation: A -> B -> C -> D -> A -> B -> C -> D.
        int result = scheduler.leastInterval(tasks, n);
        assertEquals(expected, result);
    }

}
