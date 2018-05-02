class Solution {
    public int wiggleMaxLength(int[] a) {
    	int i,j,count=1,diff,n;
    	boolean flag=true;
    	n=a.length;
    	
    	if(n<2)
    		return n;
    	
    	for(i=0;i<n-1;i++)
    	{
    		if(a[i]!=a[i+1])
    		{
    			if(a[i]>a[i+1])
    				flag=false;
    			else
    				flag=true;
    			
    			break;
    		}
    	}
    	for(;i<n-1;i++)
    	{
    		if(flag)
    		{
    			if(a[i+1]>a[i])
    			{
    				count++;
    				flag=!flag;
    			}
    		}
    		else
    		{
    			if(a[i+1]<a[i])
    			{
    				count++;
    				flag=!flag;
    			}
    		}
    			
    	}
        return count;
    }
}