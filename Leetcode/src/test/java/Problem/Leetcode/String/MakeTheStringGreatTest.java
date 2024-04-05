package Problem.Leetcode.String;

import static org.junit.Assert.*;

import org.junit.Test;

public class MakeTheStringGreatTest {

	@Test
    public void testMakeGood() {
		MakeTheStringGreat solution = new MakeTheStringGreat();

        // Test case 1
        String s1 = "leEeetcode";
        String expected1 = "leetcode";
        String actual = solution.MakeGood(s1);
        assertEquals(expected1, actual);

        // Test case 2
        String s2 = "aBbAcC";
        String expected2 = "";
        assertEquals(expected2, solution.MakeGood(s2));

        // Test case 3
        String s3 = "Pp";
        String expected3 = "";
        assertEquals(expected3, solution.MakeGood(s3));

        // Test case 4
        String s4 = "zZaA";
        String expected4 = "zZaA";
        assertEquals(expected4, solution.MakeGood(s4));

        // Test case 5
        String s5 = "abBAcC";
        String expected5 = "acC";
        assertEquals(expected5, solution.MakeGood(s5));
    }

}
