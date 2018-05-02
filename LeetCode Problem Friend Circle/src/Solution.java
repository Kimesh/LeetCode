import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int findCircleNum(int[][] a) {
    	 int i,j,n,count=1;
    	 boolean flag1,flag2;
    	 n=a.length;
    	 HashMap<Integer, Node>map=new HashMap<>();
    	 HashSet<Node> hashSet=new HashSet<>();
    	 for(i=0;i<n;i++)
    	 {
    		 Node node=new Node();
    		 node.data=i;
    		 node.rank=0;
    		 node.parent=node;
    		 map.put(i, node);
    	 }
    	 
    	 for(i=0;i<n;i++)
    	 {
    		 for(j=0;j<n;j++)
    		 {
    			 if(a[i][j]==1)
    			 {
    				 Node n1=map.get(i);
    				 Node n2=map.get(j);
    				 Node temp1=n1;
    				 Node temp2=n2;
    				 while(temp1!=temp1.parent)
    					 temp1=temp1.parent;
    				 while(temp2!=temp2.parent)
    					 temp2=temp2.parent;
    				 
    				 if(temp1!=temp2)
    				 {
    					 if(temp1.rank>=temp2.rank)
    					 {
    						 temp2.parent=temp1;
    						 temp1.rank=(int)Math.max(temp1.rank, temp2.rank);
    					 }
    					 else
    					 {
    						 temp1.parent=temp2;
    						 temp2.rank=(int)Math.max(temp1.rank, temp2.rank);
    					 }
    				 }
    			 }
    		 }
    	 }
    	 
    	 for(i=0;i<n;i++)
    	 {
    		 Node n1=map.get(i);
    		 while(n1!=n1.parent)
    			 n1=n1.parent;
    		 hashSet.add(n1);
    	 }
        return hashSet.size();
    }
}

class Node{
	int data;
	int rank;
	Node parent;
}