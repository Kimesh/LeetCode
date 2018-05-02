import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

class Solution {
    HashMap<String, TreeSet<String>> map;
	public List<String> findItinerary(String[][] tickets) {
		map=new HashMap<>();
		List<String> ans=new ArrayList<>();
		
		int i,n;
		n=tickets.length;
		for(i=0;i<n;i++)
		{
			if(!map.containsKey(tickets[i][0]))
			{
				TreeSet<String> temp=new TreeSet<String>();
				temp.add(tickets[i][1]);
				map.put(tickets[i][0], temp);
			}
			else
			{
				TreeSet<String> temp=map.get(tickets[i][0]);
				temp.add(tickets[i][1]);
				map.put(tickets[i][0], temp);
			}
		}
    	
		fun("JFK",ans);
    	return ans;
    }
	private void fun(String key, List<String> ans) {

		ans.add(key);
		if(map.containsKey(key))
		{
			
			TreeSet<String> temp=map.get(key);
			while(!temp.isEmpty())
			{
				String newKey=temp.pollFirst();
				fun(newKey,ans);
			}
		}
	}
}