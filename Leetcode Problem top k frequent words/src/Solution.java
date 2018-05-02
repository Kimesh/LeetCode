import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
    	
    	int i;
    	HashMap<String,Integer>map=new HashMap<>();
    	PriorityQueue<Node> queue=new PriorityQueue<>();
    	
    	List<String> list = null;
    	if(k>0)
    		list=new ArrayList<>(k);
    	else 
    		return list;
    	
    	for(i=0;i<words.length;i++)
    	{
    		if(map.containsKey(words[i]))
    			map.put(words[i], map.get(words[i])+1);
    		else
    			map.put(words[i],1);
    	}
    	
    	for (Map.Entry<String, Integer> entry : map.entrySet()) 
    	{
    		Node n=new Node(entry.getKey(),entry.getValue());
    		
    		if(queue.size()<k)
    			queue.add(n);
    		else
    		{
    			Node temp=queue.poll();
    			if(temp.value<n.value)
    				queue.add(n);
    			else if(temp.value==n.value)
    			{
    				if(temp.key.compareTo(n.key)<0)
    					queue.add(temp);
    				else
    					queue.add(n);
    			}
    			else
    				queue.add(temp);
    		}
    		
    	}
    	
    	PriorityQueue<Node> q=new PriorityQueue<>(Collections.reverseOrder());
    	while(!queue.isEmpty())
    		list.add(0,queue.poll().key);
    //	Collections.reverse(list);
    return list;
    }
}

class Node implements Comparable<Node>{

	String key;
	Integer value;
	public Node(String key, Integer value) {
		// TODO Auto-generated constructor stub
		this.key=key;
		this.value=value;
	}
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if(this.value<o.value)
			return -1;
		else if(this.value==o.value)
			return 0;
		else 
			return 1;
	}
	
}