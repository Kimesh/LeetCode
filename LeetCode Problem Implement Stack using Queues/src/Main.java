
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack a=new MyStack();
		a.push(1);
		a.push(2);
		System.out.println(a.top());
		System.out.println(a.top());
		System.out.println(a.pop());
		System.out.println(a.empty());
		System.out.println(a.pop());
		System.out.println(a.empty());
	}

}
