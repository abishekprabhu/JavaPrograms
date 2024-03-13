package Problem.Leetcode.list;

import Problem.Leetcode.common.ListNode;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		//special cases
		if(l1 == null)
			return l2;
		
		if(l2 == null) {
			return l1;
		}
		//Dummy node previous to the head node 
		
		ListNode dummy = new ListNode(-1);
		
		ListNode temp = dummy;
		
		int carry = 0;
		
		//loop until both lists have nodes
		
		while(l1 != null && l2 != null) {
			
			int sum = carry + l1.val + l2.val;
			
			temp.next = new ListNode(sum%10);
			temp = temp.next;
			
			carry = sum /10;
			
			//move to next node;
			l1 = l1.next;
			l2 = l2.next;
			
			
		}
		
		//loop until remaining l1 node
		while(l1 != null) {
			
			int sum = carry + l1.val;
			
			temp.next = new ListNode(sum%10);
			carry = sum/10;
			temp = temp.next;
			
			l1 = l1.next;
		}
		
		//loop until l2 node complete
		
		while(l2 != null) {
			int sum = carry + l2.val;
			
			temp.next = new ListNode(sum%10);
			carry = sum/10;
			temp = temp.next;
			
			l2 = l2.next;
		}
		
		if(carry!=0) {
			temp.next = new ListNode(carry);
		}
		
		return dummy.next;
		
		
	}

}
