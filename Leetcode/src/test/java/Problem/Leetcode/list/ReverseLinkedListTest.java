package Problem.Leetcode.list;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Problem.Leetcode.common.ListNode;

public class ReverseLinkedListTest {

	 @Test
	    public void testReverseListExample1() {
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);
	        head.next.next.next.next = new ListNode(5);

	        ReverseLinkedList solution = new ReverseLinkedList();
	        ListNode reversedHead = solution.reverseList(head);

	        assertEquals(5, reversedHead.val);
	        assertEquals(4, reversedHead.next.val);
	        assertEquals(3, reversedHead.next.next.val);
	        assertEquals(2, reversedHead.next.next.next.val);
	        assertEquals(1, reversedHead.next.next.next.next.val);
	        assertEquals(null, reversedHead.next.next.next.next.next);
	    }

	    @Test
	    public void testReverseListExample2() {
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);

	        ReverseLinkedList solution = new ReverseLinkedList();
	        ListNode reversedHead = solution.reverseList(head);

	        assertEquals(2, reversedHead.val);
	        assertEquals(1, reversedHead.next.val);
	        assertEquals(null, reversedHead.next.next);
	    }

	    @Test
	    public void testReverseListExample3() {
	        ListNode head = null;

	        ReverseLinkedList solution = new ReverseLinkedList();
	        ListNode reversedHead = solution.reverseList(head);

	        assertEquals(null, reversedHead);
	    }

}
