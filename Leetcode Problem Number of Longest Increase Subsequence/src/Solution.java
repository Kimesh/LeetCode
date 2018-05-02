import java.util.Arrays;

class Solution {
    public int findNumberOfLIS(int[] nums) {
    
    	int i,j,value,count,n;
    	n=nums.length;
    	if(n==0)
    		return 0;
    	int a[]=new int [n];
    	Arrays.fill(a, 1);
    	
    	for(i=1;i<n;i++)
    	{
    		for(j=0;j<i;j++)
    		{
    			if(nums[i]>nums[j] && a[j]+1>a[i])
    				a[i]=a[j]+1;
    		}
    	}
    	int maxIndex=0;
    	for(i=0;i<n;i++)
    	{
    		if(a[i]>=a[maxIndex])
    			maxIndex=i;
    	}
    		
    	i=maxIndex;
    	count=1;
    	value=1;
    	while(i>0)
    	{
    		if(a[i]==a[i-1])
    			value++;
    		else
    		{
    			count=count*value;
    			value=1;
    		}
    		i--;
    	}
    	return Math.max(count, count*value);
    }
}