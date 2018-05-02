import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public boolean canFinish(int numCourses, int[][] a) {
 
    	int i,n;
    	boolean flag=true;
    	n=a.length;
    	
    	HashMap<Integer,List<Integer>> map=new HashMap<>();
    	
    	for(i=0;i<n;i++)
    	{
    		ArrayList<Integer> temp;
    		if(!map.containsKey(a[i][1]))
    		{
    			 temp=new ArrayList<>();
    			temp.add(a[i][0]);
    			map.put(a[i][1], temp);
    		}
    		else
    		{
    			temp=(ArrayList<Integer>) map.get(a[i][1]);
    			temp.add(a[i][0]);
    			map.put(a[i][1], temp);
    		}
    		
    	}
    	for(i=0;i<n && flag;i++)
    		flag=fun(map,a[i][1]);
    		
    	return flag;
    }

	private boolean fun(HashMap<Integer, List<Integer>> map, int key) {
		boolean flag=true;
		
		if(map.containsKey(key))
		{
			List<Integer> temp=map.get(key);
			for(int i=0;i<temp.size() && flag;i++)
			{
				Integer val=temp.get(i);
				temp.set(i, -1);
				if(val!=-1)
					flag=fun(map,val);
				else
					flag=false;
			}
			if(flag)
				map.remove(key);
		}
		return flag;
	}
}