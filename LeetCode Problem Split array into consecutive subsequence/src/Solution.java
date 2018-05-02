import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public boolean isPossible(int[] nums) {
    	int i,j,count=0;
    	int n=nums.length;
    	boolean flag=true;
    	List<LinkedList<Integer>> list=new ArrayList<LinkedList<Integer>>();
    	
    	for(i=0;i<n;i++)
    	{
    		flag=true;
    		
    		for(j=0;j<list.size();j++)
    		{
    			LinkedList<Integer> l=list.get(j);
    			if(l.getLast()+1==nums[i])
    			{
    				l.add(nums[i]);
    				if(l.size()==3)
    					count++;
    				flag=false;
    				break;
    			}
    		}
    		if(flag)
    		{
    			LinkedList<Integer> temp=new LinkedList<Integer>();
    			temp.add(nums[i]);
    			list.add(temp);
    		}
    	
    	}
    	
    	if(count==list.size())
        return true;
    	else
    		return false;
    }
}