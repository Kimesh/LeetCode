
public class Main {

	public static void main(String[]args)
	{
		ListNode head=new ListNode(0);
		ListNode p=head;
		for(int i=1;i<5;i++)
		{
			ListNode temp=new ListNode(i);
			p.next=temp;
			p=p.next;
		}
		
		Solution s=new Solution(head);
		System.out.println(s.getRandom());
	}
}
