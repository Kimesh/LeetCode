
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueue queue=new MyQueue();
		queue.push(1);
		queue.push(2);
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.empty());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.empty());
	}

}
