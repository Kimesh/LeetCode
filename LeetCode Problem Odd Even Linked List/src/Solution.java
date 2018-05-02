/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
        	return head;
    	ListNode head1,head2,odd,even;
        head1=head;
        head2=head.next;
        odd=head;
        even=head.next;
        
        while(true)
        {
        	if(odd!=null && odd.next!=null)
        		odd.next=odd.next.next;
        	if(even!=null && even.next!=null)
        		even.next=even.next.next;
        	if(odd.next!=null)
        	{
        		odd=odd.next;
        		even=even.next;
        	}
        	else
        		break;
        }
        
        odd.next=head2;
        return head1;
    }
}