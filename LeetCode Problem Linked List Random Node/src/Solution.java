import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
   
	int n;
	ListNode head;
	ListNode p;
	public Solution(ListNode head) {
        this.head=head;
		p=head;
        n=1;
        while(p!=null)
        {
        	p=p.next;
        	n++;
        }
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
    	Random random =new Random();
    	int val=random.nextInt(n);
    	//System.out.println("val"+ val);
        p=head;
        for(int i=1;i<val;i++)
        	p=p.next;
        
    	return p.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */