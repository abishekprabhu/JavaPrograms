package Problem.Leetcode.list;

import Problem.Leetcode.common.ListNode;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
	if(head == null)
		return head;
	
	ListNode prevNode = null;
	ListNode currentNode = head;
	ListNode nextNode = null;
	
	while( currentNode != null) {
		nextNode = currentNode.next;
		currentNode.next = prevNode;
		prevNode = currentNode;
		currentNode = nextNode;
		
	}
	return prevNode;
	
	}
}
