/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
    	
    	ListNode p=head,lessHead=null,greaterHead=null,tempLess = null,tempGreater=null;
    	while(p!=null)
    	{
    		if(p.val<x)
    		{
    			if(lessHead==null)
    			{
    				lessHead=new ListNode(p.val);
    				tempLess=lessHead;
    			}
    			else
    			{
    				tempLess.next=new ListNode(p.val);
    				tempLess=tempLess.next;
    			}
    		}
    		else
    		{
    			if(greaterHead==null)
    			{
    				greaterHead=new ListNode(p.val);
    				tempGreater=greaterHead;
    			}
    			else
    			{
    				tempGreater.next=new ListNode(p.val);
    				tempGreater=tempGreater.next;
    			}
    		}
    		p=p.next;
    	}
    	
    	if(lessHead!=null && greaterHead!=null)
    		tempLess.next=greaterHead;
    	else
    		lessHead=head;
    	
        return lessHead;
    }
}