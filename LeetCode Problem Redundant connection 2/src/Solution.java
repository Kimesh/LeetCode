import java.util.HashMap;

class Solution {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int i,n;
        n=edges.length;
        HashMap<Integer, Node> map=new HashMap<>();
        int ans[]=new int[2];
        for(i=0;i<n;i++)
        {
        	Node node=new Node();
        	node.data=i+1;
        	node.rank=0;
        	node.parent=node;
        	map.put(i+1, node);
        }
        
        for(i=0;i<n;i++)
        {
        	Node n1=map.get(edges[i][0]);
        	Node n2=map.get(edges[i][1]);
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
        		n2.parent=temp1;
        		temp1.rank=(int)Math.max(temp1.rank, temp2.rank)+1;
        	}
        	else if(temp1.rank<temp2.rank)
        	{
        		n1.parent=temp2;
        		temp2.rank=(int)Math.max(temp1.rank, temp2.rank)+1;
        	}
        }
    	return ans;
    }
}
class Node{
	int data;
	int rank;
	Node parent;
	
}