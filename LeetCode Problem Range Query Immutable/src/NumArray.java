class NumArray {

	int a[],i,j,n;
	
    public NumArray(int[] nums) {
    	n=nums.length;
    	a=new int[n+1];
    	int nextVal;
    	for(i=0;i<n;i++)
    	{
    		nextVal=i+1;
    		
    		while(nextVal<=n)
    		{
    			a[nextVal]=a[nextVal]+nums[i];
    			nextVal=nextVal+(((~nextVal)+1)&nextVal);
    		}
    	}
    }
    
    public int sumRange(int i, int j) {
    	
    	int nextVal=i;
    	int sum1=0,sum2=0;
    	while(nextVal>0)
    	{
    		sum1=sum1+a[nextVal];
    		nextVal=nextVal-(((~nextVal)+1)&nextVal);
    	}
    	nextVal=j+1;
    	while(nextVal>0)
    	{
    		sum2=sum2+a[nextVal];
    		nextVal=nextVal-(((~nextVal)+1)&nextVal);
    	}
        return sum2-sum1;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */