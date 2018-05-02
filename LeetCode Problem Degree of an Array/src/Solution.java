import java.util.ArrayList;

class Solution {
    public int findShortestSubArray(int[] nums) {
    	int i,j,k,n,max,min;
    	n=nums.length;
    	int a[]=new int[50000];
    	ArrayList<Integer> list=new ArrayList<>();
    	max=0;
    	
    	for(i=0;i<n;i++)
    	{
    		a[nums[i]]++;
    		if(a[nums[i]]>max)
    			max=a[nums[i]];
    	}
    	
    	for(i=0;i<50000;i++)
    	{
    		if(a[i]==max)
    			list.add(i);
    	}
    	
    	min=Integer.MAX_VALUE;
    	for(i=0;i<list.size();i++)
    	{
    		int val=list.get(i);
    		j=0;k=n-1;
    		while(nums[j]!=val)
    			j++;
    		while(nums[k]!=val)
    		k--;
    		
    		if(k-j+1<min)
    			min=k-j+1;
    	}
        return min;
    }
}