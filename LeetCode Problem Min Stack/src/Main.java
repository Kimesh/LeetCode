
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  MinStack obj = new MinStack();
		  System.out.println(obj.top());
		  obj.push(-2);
		  obj.push(0);
		  obj.push(-3);
		  System.out.println(obj.getMin());
		  obj.pop();
		  System.out.println(obj.top());
		  System.out.println(obj.getMin());
		 
	}

}
