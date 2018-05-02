import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] a) {
    	
    	int i,j,top,n,area,maxArea;
    	
    	n=a.length;
    	if(n==0)
    		return 0;
    	Stack<Integer> stack=new Stack<>();
    	//stack.push(0);
    	maxArea=0;
    	for(i=0;i<n;i++)
    	{
    		if(stack.isEmpty() || a[i]>=a[stack.peek()])
    			stack.push(i);
    		else 
    		{
    			while(!stack.isEmpty())
    			{
    				if(a[i]<a[stack.peek()])
    				{
    					top=stack.pop();
    					if(stack.isEmpty())
    					area=a[top]*i;
    					else
    						area=a[top]*(i-top);
    					if(area>maxArea)
    						maxArea=area;
    				}
    					
    				else
    				{
    					stack.push(i);
    					break;
    				}
    			}
    			if(i<n)
    			stack.push(i);
    		}
    	}
    	while(!stack.isEmpty())
    	{
    		top=stack.pop();
			if(stack.isEmpty())
			area=a[top]*i;
			else
				area=a[top]*(i-top);
			if(area>maxArea)
				maxArea=area;
    	}
     return maxArea;   
    }
}