import java.util.HashSet;

class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
    	int i,j,target,count,sum=0,n;
    	n=nums.length;
    	for(i=0;i<n;i++)
    		sum+=nums[i];
    	if(sum%k!=0)
    		return false;
    	target=sum/k;
    	
    	boolean b[][]=new boolean [n+1][target+1];
    	HashSet<Integer> hashSet=new HashSet<>();
    	for(i=0;i<=n;i++)
    		b[i][0]=true;
    	
    	for(i=1;i<=n;i++)
    	{
    		for(j=1;j<=target;j++)
    		{
    			if(nums[i-1]<=j)
    			{
    				count=i-1;
    				while(hashSet.contains(count))
    					count--;
    				b[i][j]=b[count][j-nums[i-1]];
    			}
    		}
    		if(b[i][target])
    		{
    			int column=target;
    			int row=i;
    			while(column!=0)
    			{
    				if(!hashSet.contains(row))
    				{
    					hashSet.add(row);
        				column=column-nums[row-1];	
    				}
    				row--;
    			}
    				
    		}
    			
    	}
    	if(hashSet.size()==n)
        return true;
    	return false;
    }
}