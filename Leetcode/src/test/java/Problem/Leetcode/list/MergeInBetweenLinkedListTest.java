package Problem.Leetcode.list;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Problem.Leetcode.common.ListNode;

public class MergeInBetweenLinkedListTest {

	 @Test
	   public void testMergeInBetween_Example1() {
	        // Create list1: [10,1,13,6,9,5]
	        ListNode list1 = createLinkedList(new int[]{10, 1, 13, 6, 9, 5});

	        // Create list2: [1000000,1000001,1000002]
	        ListNode list2 = createLinkedList(new int[]{1000000, 1000001, 1000002});

	        MergeInBetweenLinkedList merger = new MergeInBetweenLinkedList();
	        ListNode result = merger.mergeInBetween(list1, 3, 4, list2);

	        int[] expectedArray = {10, 1, 13, 1000000, 1000001, 1000002, 5};
	        assertLinkedListEquals(expectedArray, result);
	    }

	    @Test
	   public void testMergeInBetween_Example2() {
	        // Create list1: [0,1,2,3,4,5,6]
	        ListNode list1 = createLinkedList(new int[]{0, 1, 2, 3, 4, 5, 6});

	        // Create list2: [1000000,1000001,1000002,1000003,1000004]
	        ListNode list2 = createLinkedList(new int[]{1000000, 1000001, 1000002, 1000003, 1000004});

	        MergeInBetweenLinkedList merger = new MergeInBetweenLinkedList();
	        ListNode result = merger.mergeInBetween(list1, 2, 5, list2);

	        int[] expectedArray = {0, 1, 1000000, 1000001, 1000002, 1000003, 1000004, 6};
	        assertLinkedListEquals(expectedArray, result);
	    }

	    private ListNode createLinkedList(int[] values) {
	        ListNode dummy = new ListNode(-1);
	        ListNode current = dummy;
	        for (int value : values) {
	            current.next = new ListNode(value);
	            current = current.next;
	        }
	        return dummy.next;
	    }

	    private void assertLinkedListEquals(int[] expectedArray, ListNode head) {
	        ListNode current = head;
	        for (int value : expectedArray) {
	            assertEquals(value, current.val);
	            current = current.next;
	        }
	        assertEquals(null, current);
	    }

}
