import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
    	
    	int size,i,j,max=Integer.MAX_VALUE,count = 1;
    	size=edges.length;
    	
    	HashMap<Integer, List<Integer>> map=new HashMap<>();
    	List<Integer> ans=new ArrayList<>();
    	if(size==0)
    	{
    		ans.add(0);
    		return ans;
    	}
        	
    	boolean flag;
    	for(i=0;i<size;i++)
    	{
    		if(!map.containsKey(edges[i][0]))
    		{
    			ArrayList<Integer> temp=new ArrayList<Integer>();
    			temp.add(edges[i][1]);
    			map.put(edges[i][0],temp);
    		}
    		else
    		{
    			List<Integer> temp=map.get(edges[i][0]);
    			temp.add(edges[i][1]);
    			map.put(edges[i][0],temp);
    		}
    		if(!map.containsKey(edges[i][1]))
    		{
    			ArrayList<Integer> temp=new ArrayList<Integer>();
    			temp.add(edges[i][0]);
    			map.put(edges[i][1],temp);
    		}
    		else
    		{
    			List<Integer> temp=map.get(edges[i][1]);
    			temp.add(edges[i][0]);
    			map.put(edges[i][1],temp);
    		}	
    	}
    	
    	
    	for(Integer key: map.keySet())
    	{
    		Queue<Integer> queue=new LinkedList<>();
    		Queue<Integer> depth=new LinkedList<>();
    		boolean arr[]=new boolean[n];
    		arr[key]=true;
    		count=1;
    		queue.add(key);
    		queue.add(1);
    		
    		while(!queue.isEmpty())
    		{
    			List<Integer> temp=map.get(queue.poll());
    			int prev=queue.poll();
    			flag=false;
    			for(i=0;i<temp.size();i++)
    			{
    				Integer val=temp.get(i);
    				if(!arr[val])
    				{
    					flag=true;
    					arr[val]=true;
    					queue.add(val);
    					queue.add(prev+1);
    				}
    			}
    			if(flag)
    			{
    				count=prev;
    				//count++;
    			}
    				
    		}
    		
    		if(count<max)
    		{
    			max=count;
    			ans.clear();
    			ans.add(key);
    		}
    		else if(count==max)
    			ans.add(key);
    	}
//    	if(count<max)
//		{
//			max=count;
//			ans.clear();
//			ans.add(key);
//		}
//		else if(count==max)
//			ans.add(key);
    //	System.out.println("Count: "+count+" Max: "+max);
    	
        return ans;
    }
}