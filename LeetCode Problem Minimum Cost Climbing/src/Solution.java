class Solution {
    public int minCostClimbingStairs(int[] cost) {
    	
    	int i,j,k,n;
    	n=cost.length;
    	int a[]=new int [n+1];
    	
    	a[0]=cost[0];
    	a[1]=cost[1];
    	
    	for(i=2;i<n;i++)
    		a[i]=Math.min(a[i-2]+cost[i], a[i-1]+cost[i]);
    	a[n]=Math.min(a[n-2], a[n-1]);
        return a[n];
    }
}