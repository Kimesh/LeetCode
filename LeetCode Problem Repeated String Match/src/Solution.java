class Solution {
    public int repeatedStringMatch(String A, String B) {
    	
    	int n1,n2,i,min=Integer.MAX_VALUE,val;
    	n1=A.length();
    	n2=B.length();
    
    	for(i=0;i<n1;i++)
    	{
    		char c=A.charAt(i);
    		if(c==B.charAt(0))
    		{
    			val=fun(A,B,i,n1,n2);
    			if(val<min)
    				min=val;
    		}
    	}
    	
    	if(min==Integer.MAX_VALUE)
    		min=-1;
        return min;
    }

	private int fun(String A, String B, int i, int n1, int n2) {
		int j,count=1;
		
		j=0;
		while(j<n2)
		{
			if(A.charAt(i)==B.charAt(j))
			{
				j++;
				i++;
				if(i==n1 && j<n2)
				{
					i%=n1;
					count++;
				}
			}
			else
				break;
		}
		if(j!=n2)
			count=Integer.MAX_VALUE;
		return count;
	}
}