package Problem.Leetcode.list;

import static org.junit.Assert.*;

import org.junit.Test;

import Problem.Leetcode.common.ListNode;

public class AddTwoNumbersTest {
	
	private final AddTwoNumbers testObject = new AddTwoNumbers();
	
	@Test
	public void testAddTwoNumbers() {

		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		ListNode expected = testObject.addTwoNumbers(l1, l2);
		assertEquals(7, expected.val);
		assertEquals(0, expected.next.val);
		assertEquals(8, expected.next.next.val);
		
				
	}

}
