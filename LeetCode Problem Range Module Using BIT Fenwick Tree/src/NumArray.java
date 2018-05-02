class NumArray {

	int a[],i,n;
	int nums[];
    public NumArray(int[] nums) {
        n=nums.length;
    	a=new int[n+1];
    	this.nums=nums;
    	int nextVal;
    	for(i=0;i<n;i++)
    	{
    	//	a[i+1]=a[i+1]+nums[i];
    		nextVal=i+1;
    		while(nextVal<=n)
    		{
    			a[nextVal]=a[nextVal]+nums[i];
    			nextVal=nextVal+(((~nextVal)+1) & nextVal);
    		}
    	}
    }
    
    public void update(int i, int val) {
        int diff=val-nums[i];
        nums[i]=nums[i]+diff;
        int nextVal=i+1;
        while(nextVal<=n)
        {
        	a[nextVal]=a[nextVal]+diff;
        	nextVal=nextVal+(((~nextVal)+1)&nextVal);
        }
    }
    
    public int sumRange(int i, int j) {
    	
    	int sum1=0;
    	int sum2=0;
    	int nextVal=i;
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
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 */