class Solution {
    public int findTargetSumWays(int[] nums, int S) {
    return	findNumber(nums.length,nums,S,0,0);
    }

	private int findNumber(int n, int[] nums, int target, int index, int sum) {
		if(index<n)
		{
			int left=findNumber(n,nums,target,index+1,sum+nums[index]);
			int right=findNumber(n, nums, target, index+1, sum-nums[index]);
			return left+right;
		}
		else if(sum==target)
			return 1;
		return 0;
	}
}