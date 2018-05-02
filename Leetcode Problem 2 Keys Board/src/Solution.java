class Solution {
    public int minSteps(int n) {
    	
    	if(n<2)
    		return 0;
    	int i,j,max;
    	int a[]=new int[n+1];
    	a[0]=0;
    	a[1]=1;
    	
    	for(i=2;i<=n;i++)
    	{
    		max=i;
    		for(j=2;j<(i/2)+1;j++)
    		{
    			if(i%j==0 && a[j]+(i/j)<max)
    				max=a[j]+i/j;
    		}
    		a[i]=max;
    	}
        return a[n];
    }
}