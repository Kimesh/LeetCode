class Solution {
    public int minSwapsCouples(int[] a) {
    	int n,count=0,i,temp,j;
    	n=a.length;
    	for(i=0;i<n;i=i+2)
    	{
    		if(a[i]%2==0 && a[i+1]!=a[i]+1)
    		{
    			for(j=i+2;j<n;j++)
    			{
    				if(a[j]==a[i]+1)
    				{
    					temp=a[j];
    					a[j]=a[i+1];
    					a[i+1]=temp;
    					count++;
    					break;
    				}
    			}
    		}
    		else if(a[i]%2==1 && a[i+1]!=a[i]-1)
    		{
    			for(j=i+2;j<n;j++)
    			{
    				if(a[j]==a[i]-1)
    				{
    					temp=a[j];
    					a[j]=a[i+1];
    					a[i+1]=temp;
    					count++;
    					break;
    				}
    		}
    	}
    }
        return count;
    }
}