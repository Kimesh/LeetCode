import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] a, int k) {
    	
    	HashMap<Double, Node> map=new HashMap<>();
    	ArrayList<Double> list=new ArrayList<>();
    	int n=a.length, i,j;
    	
    	PriorityQueue<Double> queue=new PriorityQueue<>();
    	for(i=0;i<n;i++)
    	{
    		for(j=i+1;j<n;j++)
    		{
    			double d=(double)a[i]/(double)a[j];
    			map.put(d, new Node(a[i],a[j]));
    			//list.add(d);
    			queue.add(d);
    		}
    	}
    	System.out.println("Priority queue is taking time. ");
    	//Collections.sort(list);
    	//Double key=list.get(k-1);
    	while(k>1)
    	{
    	//	map.pollFirstEntry();
    		queue.poll();
    		k--;
    	}
    	Double key=queue.poll();
    	//Node node= map.pollFirstEntry().getValue();
    	Node node=map.get(key);
    	int ans[]= {node.p,node.q};
        return ans;
    }
}

class Node{
	int p,q;

	public Node(int p, int q) {
		super();
		this.p = p;
		this.q = q;
	}
	
}