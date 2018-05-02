class Solution {
    public boolean isPalindrome(ListNode head) {
    	ListNode p=head,newHead=null,temp;
    	if(p!=null)
    	{
    		newHead=new ListNode(p.val);
    		p=p.next;
    	}
    	while(p!=null)
    	{
    		temp=new ListNode(p.val);
    		temp.next=newHead;
    		newHead=temp;
    		p=p.next;
    	}
    	p=head;
    	while(p!=null)
    	{
    		if(p.val!=newHead.val)
    			return false;
    		p=p.next;
    		newHead=newHead.next;
    	}
        return true;
    }
}