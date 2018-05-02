
public class Main {

	public static void main(String[]args)
	{
		ListNode l1=new ListNode(9);
//		l1.next=new ListNode();
//		l1.next.next=new ListNode(4);
//		l1.next.next.next=new ListNode(3);
		
		ListNode l2=new ListNode(1);
//		l2.next=new ListNode(9);
//		l2.next.next=new ListNode(9);
		
		Solution s=new Solution();
		ListNode list=s.addTwoNumbers(l1, l2);
		while(list!=null)
		{
			System.out.println(list.val);
			list=list.next;
		}
	}
}
