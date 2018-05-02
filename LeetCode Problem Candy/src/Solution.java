class Solution {
    public int candy(int[] ratings) {
    	int i,n,j,min=Integer.MAX_VALUE;
    	int sum=0;
    	n=ratings.length;
    	if(n<=1)
    		return n;
    	
    	int a[]=new int[n];
    	for(i=0;i<n;i++)
    		a[i]=1;
    	for(i=1;i<n;i++)
    	{
    		if(ratings[i]>ratings[i-1])
    			a[i]=a[i-1]+1;
    	}
    	for(i=n-2;i>=0;i--)
    	{
    		if(ratings[i]>ratings[i+1])
    			a[i]=(int)Math.max(a[i+1]+1, a[i]);
    	}
    		
    	for(i=0;i<n;i++)
    		sum=sum+a[i];
    	return sum;
    }
}