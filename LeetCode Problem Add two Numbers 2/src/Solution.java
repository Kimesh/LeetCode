import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	
    	Stack<Integer> stack1=new Stack<>();
    	Stack<Integer> stack2=new Stack<>();
    	
    	ListNode p,head=null;
    	int val,carry=0;
    	p=l1;
      	while(p!=null)
    	{
    		stack1.push(p.val);
    		p=p.next;
    	}
    	
    	p=l2;
    	while(p!=null)
    	{
    		stack2.push(p.val);
    		p=p.next;
    	}
    	
    	while(!stack1.isEmpty() && !stack2.isEmpty())
    	{
    		val=stack1.pop()+stack2.pop()+carry;
    		carry=val/10;
    		
    		if(head==null)
    		{
    			head=new ListNode(val%10);
    			p=head;
    		}
    		else
    		{
    			ListNode temp=new ListNode(val%10);
    			temp.next=p;
    			p=temp;
    		}
    	}
    	
    	while(!stack1.isEmpty())
    	{
    		val=carry+stack1.pop();
    		carry=val/10;
    		ListNode temp=new ListNode(val%10);
    		temp.next=p;
    		p=temp;
    	}
    	
    	while(!stack2.isEmpty())
    	{
    		val=carry+stack2.pop();
    		carry=val/10;
    		ListNode temp=new ListNode(val%10);
    		temp.next=p;
    		p=temp;
    	}
    	
    	if(carry>0)
    	{
    		ListNode temp=new ListNode(carry);
    		temp.next=p;
    		p=temp;
    	}
        return p;
    }
}