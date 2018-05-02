
public class Main {

	public static void main(String[]args)
	{
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=head;
		Solution s=new Solution();
		System.out.println(s.detectCycle(head).val);
	}
}
