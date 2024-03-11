package Problem.Leetcode.String;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ReverseStringTest {
	
	private final ReverseString testObject = new ReverseString();
	@Test
	public void test() {
	     char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
	        char[] expected = new char[]{'o', 'l', 'l', 'e', 'h'};
	        testObject.reverseString(s);
	        assertArrayEquals(expected, s);

	        s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
	        expected = new char[]{'h', 'a', 'n', 'n', 'a', 'H'};
	        testObject.reverseString(s);
	        assertArrayEquals(expected,s);
	    }

}
