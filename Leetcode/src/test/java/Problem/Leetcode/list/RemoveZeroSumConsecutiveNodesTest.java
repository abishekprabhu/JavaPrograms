package Problem.Leetcode.list;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Problem.Leetcode.common.ListNode;

public class RemoveZeroSumConsecutiveNodesTest {

    private final RemoveZeroSumConsecutiveNodes testObject = new RemoveZeroSumConsecutiveNodes();

    @Test
    public void testRemoveZeroSumConsecutiveNodes() {
        // Test case: 1 -> 2 -> -3 -> 3 -> 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(-3);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(1);
        ListNode expected1 = new ListNode(3);
        expected1.next = new ListNode(1);
        assertEquals(expected1, testObject.removeZeroSumConsecutiveNodes(head1));

        // Test case: 1 -> 2 -> 3 -> -3 -> 4
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(-3);
        head2.next.next.next.next = new ListNode(4);
        ListNode expected2 = new ListNode(1);
        expected2.next = new ListNode(2);
        expected2.next.next = new ListNode(4);
        assertEquals(expected2, testObject.removeZeroSumConsecutiveNodes(head2));

        // Test case: 1 -> 2 -> 3 -> 4 -> -10
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        head3.next.next = new ListNode(3);
        head3.next.next.next = new ListNode(4);
        head3.next.next.next.next = new ListNode(-10);
        ListNode expected3 = new ListNode(4);
        assertEquals(expected3, testObject.removeZeroSumConsecutiveNodes(head3));

        // Test case: Empty list
        ListNode head4 = null;
        assertEquals(null, testObject.removeZeroSumConsecutiveNodes(head4));
    }
}
