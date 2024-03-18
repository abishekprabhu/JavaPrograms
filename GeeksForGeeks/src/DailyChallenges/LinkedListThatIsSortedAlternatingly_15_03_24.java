package DailyChallenges;
import java.util.Scanner;

class ListNode {
    int data;
    ListNode next;
    
    public ListNode (int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListThatIsSortedAlternatingly_15_03_24 {
	
	 static void printList(ListNode node) 
		{ 
			while (node != null) 
			{ 
				System.out.print(node.data + " "); 
				node = node.next; 
			} 
			System.out.println(); 
		}
		public static void main (String[] args) {
			Scanner sc  = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-- > 0){
			    int n = sc.nextInt();
			    
			    ListNode head = new ListNode(sc.nextInt());
			    ListNode tail = head;
			    
			    for(int i=1; i<n; i++){
			        tail.next = new ListNode(sc.nextInt());
			        tail = tail.next;
			    }
			    Solution obj = new Solution();
			    head = obj.sort(head);
			    printList(head);
			}
		}
}
class Solution {
    
    public ListNode sort(ListNode head){
        if (head == null || head.next == null) {
            return head; // If the list is empty or has only one node, it's already sorted
        }
        
        // Initialize pointers for ascending and descending sublists
        ListNode ascHead = null, ascTail = null;
        ListNode descHead = null, descTail = null;
        
        // Traverse the list and separate into alternating ascending and descending sublists
        while (head != null) {
            if (ascHead == null) {
                ascHead = head;
                ascTail = head;
            } else {
                ascTail.next = head;
                ascTail = head;
            }
            head = head.next;
            
            if (head != null) {
                if (descHead == null) {
                    descHead = head;
                    descTail = head;
                } else {
                    descTail.next = head;
                    descTail = head;
                }
                head = head.next;
            }
        }
        
        // Terminate the sublists
        ascTail.next = null;
        descTail.next = null;
        
        // Reverse the descending sublist
        descHead = reverseList(descHead);
        
        // Merge the two sorted sublists
        return mergeLists(ascHead, descHead);
    }
    
    // Helper method to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    
    // Helper method to merge two sorted linked lists
    private ListNode mergeLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
        if (list1 != null) {
            current.next = list1;
        }
        
        if (list2 != null) {
            current.next = list2;
        }
        
        return dummy.next;
    }
}
/*INPUT:
 *   2
 *   6
 *   1 9 2 8 3 7 
 *   5
 *   13 99 21 80 50
 *    
 *     output: 
 *     1 2 3 7 8 9
 *     13 21 50 80 99
 */