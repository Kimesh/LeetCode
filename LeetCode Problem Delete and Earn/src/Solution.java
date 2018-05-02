import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int deleteAndEarn(int[] nums) {
    	
    	int i,j,sum,n;
    	n=nums.length;
    	if(n==0)
    		return 0;
    	Arrays.sort(nums);
    	List<int[]> list=new ArrayList<>();	
    	sum=0;j=0;
    	for(i=0;i<n;i++)
    	{
    		if(i<n-1 && nums[i]==nums[i+1])
    			sum=sum+nums[i];
    		else
    		{
    			sum=sum+nums[i];
    			list.add(new int[2]);
    			list.get(j)[0]=nums[i];
    			list.get(j)[1]=sum;
    			sum=0;
    			j++;
    		}
    	}
    	
    	int dp[][]=new int[list.size()+2][2];
    	dp[2][0]=list.get(0)[1];
    	dp[2][1]=0;
    	
    	for(i=1;i<list.size();i++)
    	{
    		j=i+2;
    		
    		if(list.get(i-1)[0]==list.get(i)[0]-1)
    		{
    			dp[j][0]=list.get(i)[1]+Math.max(dp[j-2][0], dp[j-2][1]);
    			dp[j][1]=Math.max(dp[j-1][0], dp[j-1][1]);
    		}
    		else
    		{
    			dp[j][0]=list.get(i)[1]+Math.max(dp[j-1][0], dp[j-1][1]);
    			dp[j][1]=Math.max(dp[j-1][0], dp[j-1][1]);
    		}
    	}
        return Math.max(dp[list.size()+1][0], dp[list.size()+1][1]);
    }
}