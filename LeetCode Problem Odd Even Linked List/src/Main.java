
public class Main {

	public static void main(String[]args)
	{
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		Solution s=new Solution();
		ListNode list=s.oddEvenList(null);
		while(list!=null)
		{
			System.out.println(list.val);
			list=list.next;
		}
	}
}
