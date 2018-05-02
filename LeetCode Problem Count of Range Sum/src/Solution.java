class Solution {
	long[] segment;
	int n;
    public int countRangeSum(int[] nums, int lower, int upper) {
    	
    	int i,count=0;
		if (nums.length > 0)
		{
			n=nums.length;
			while(n%2==0)
				n=n/2;
			if(n==1 && nums.length>1)
				n=2*nums.length-1;
			else
			n = 2 * nextPowerOfTwo(nums.length) - 1;
			segment = new long[n];
			for(i=0;i<n;i++)
				segment[i]=Long.MAX_VALUE;
			
			createSegmentTree(nums, segment, 0, nums.length - 1, 0);
			
			for(i=0;i<n;i++)
			{
				System.out.println(segment[i]);
				if(segment[i]>=lower && segment[i]<=upper)
					count++;
			}
		}
        return count;
    }
    private void createSegmentTree(int[] a, long[] segment, int l, int u, int pos) {

    	if(l==u)
    		segment[pos]=a[l];
    	else
    	{
    		int mid=(l+u)/2;
    		createSegmentTree(a, segment, l, mid, 2*pos+1);
    		createSegmentTree(a, segment, mid+1, u, 2*pos+2);
    		segment[pos]=segment[2*pos+1]+segment[2*pos+2];
    	}
    }
	private int nextPowerOfTwo(int x) {
		int counter = 0;
		while (x > 0)
		{
			counter++;
			x = x >> 1;
		}
		return (1 << counter);
	}
}