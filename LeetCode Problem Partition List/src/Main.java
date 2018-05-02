
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head =new ListNode(1);
		head.next=new ListNode(4);
		head.next.next=new ListNode(2);
		head.next.next.next=new ListNode(2);
		head.next.next.next.next=new ListNode(5);
		head.next.next.next.next.next=new ListNode(2);
		//head.next=new ListNode(1);
		//head.next.next=new ListNode(1);
		
		Solution s=new Solution();
		ListNode list=s.partition(head,100);
		while(list!=null)
		{
			System.out.println(list.val);
			list=list.next;
		}
		
	}

}
