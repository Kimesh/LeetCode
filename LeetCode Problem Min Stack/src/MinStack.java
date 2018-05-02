import java.util.Stack;

class MinStack {

	Stack<Integer> normalStack;
	Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        normalStack=new Stack<Integer>();
        minStack=new Stack<>();
    }
    
    public void push(int x) {
    	normalStack.push(x);
        if(minStack.isEmpty() || x<minStack.peek())
        	minStack.push(x);
        else
        	minStack.push(minStack.peek());
    }
    
    public void pop() {
        minStack.pop();
        normalStack.pop();
    }
    
    public int top() {
        return normalStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */