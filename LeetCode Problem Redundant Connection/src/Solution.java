import java.util.HashMap;

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
    	HashMap<Integer, Node> map=new HashMap<>();
    	int i,n;
    	int ans[]=new int[2];
    	n=edges.length;
    	for(i=0;i<n;i++)
    	{
    		Node temp=new Node();
    		temp.data=i+1;
    		temp.rank=0;
    		temp.parent=temp;
    		map.put(i+1, temp);
    	}
    	
    	for(i=0;i<n;i++)
    	{
    		Node n1=findSet(edges[i][0],map);
    		Node n2=findSet(edges[i][1],map);
    		Node temp1=n1;
    		Node temp2=n2;
    		while(temp1!=temp1.parent)
    			temp1=temp1.parent;
    		while(temp2!=temp2.parent)
    			temp2=temp2.parent;
    		
    		if(temp1==temp2)
    		{
    			ans[0]=edges[i][0];
    			ans[1]=edges[i][1];
    		}
    		
    		else if(temp1.rank>=temp2.rank)
    		{
    			temp2.parent=temp1;
    			temp1.rank=(int)Math.max(temp1.rank, temp2.rank)+1;
    		}
    		else if(temp1.rank<temp2.rank)
    		{
    			temp1.parent=temp2;
    			temp2.rank=(int)Math.max(temp1.rank, temp2.rank)+1;
    		}
    	}
     return ans;   
    }

	private Node findSet(int val, HashMap<Integer, Node> map) {
		return map.get(val);
	}
}
class Node{
	int data;
	int rank;
	Node parent;
}