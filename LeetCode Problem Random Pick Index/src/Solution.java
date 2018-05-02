import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

class Solution {

	Random random;
	HashMap<Integer , List<Integer>> map;
	
    public Solution(int[] a) {
        random=new Random();
        map=new HashMap<>();
        int n=a.length;
        
        for(int i=0;i<n;i++)
        {
        	if(map.containsKey(a[i]))
        	{
        		List temp=map.get(a[i]);
        		temp.add(i);
        		map.put(a[i], temp);
        	}
        	else
        	{
        		List<Integer> temp=new ArrayList<Integer>();
        		temp.add(i);
        		map.put(a[i],temp);
        	}
        }
    }
    
    public int pick(int target) {
    	List<Integer> temp=map.get(target);
    	int val=random.nextInt(temp.size());
    	return temp.get(val);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */