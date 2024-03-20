package Problem.Leetcode.list;

import Problem.Leetcode.common.ListNode;

public class MergeInBetweenLinkedList {
	 public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
		 
		 ListNode node1 = list1;
		 
		 for(int i =0; i<a-1; i++)
			 node1 = node1.next;
		 
		 ListNode listEnd = node1;
		 
		 for(int i = 0 ; i< b-a+2; i++)
			 listEnd = listEnd.next;
		 
		 node1.next = list2;
		 
		 while(node1.next != null) {
			 node1 = node1.next;
		 }
		 
		 node1.next = listEnd;
		 
		 return list1;
	 }
}
