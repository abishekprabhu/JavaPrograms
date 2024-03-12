package Problem.Leetcode.list;

import java.util.HashMap;
import java.util.Map;

import Problem.Leetcode.common.ListNode;

public class RemoveZeroSumConsecutiveNodes {
	
	public ListNode removeZeroSumConsecutiveNodes(ListNode head) {
		
		//startNode will be zero 
		ListNode startNode = new ListNode(0);
		startNode.next = head;
		
		int prefixSum = 0;
		
		Map<Integer,ListNode> map = new HashMap<>();
		
		map.put(prefixSum, startNode);
		
		while( head != null) {
			prefixSum += head.val;
			map.put(prefixSum, head);
			head = head.next;
		}
		
		prefixSum = 0;
		head = startNode;
		
		while(head != null) {
			prefixSum += head.val;
			head.next = map.get(prefixSum).next;
			head = head.next;
		}
		
		return startNode.next;
	}
}
