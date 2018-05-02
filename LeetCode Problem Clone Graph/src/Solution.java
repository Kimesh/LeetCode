import java.util.HashMap;

public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    
    	if(node==null)
    		return null;
    	
    	HashMap<Integer,UndirectedGraphNode> hashMap=new HashMap<>();
    	UndirectedGraphNode root=new UndirectedGraphNode(node.label);
    	hashMap.put(node.label, root);
    	fun(root,node,hashMap);
        return root;
    }

	private void fun(UndirectedGraphNode root, UndirectedGraphNode node, HashMap<Integer,UndirectedGraphNode> hashMap) {
		
		for(int i=0;i<node.neighbors.size();i++)
		{
			UndirectedGraphNode n=node.neighbors.get(i);
			if(!hashMap.containsKey(n.label))
			{
				UndirectedGraphNode temp=new UndirectedGraphNode(n.label);
				hashMap.put(n.label,temp);
				root.neighbors.add(temp);
				fun(temp,n,hashMap);
			}
			else
				root.neighbors.add(hashMap.get(n.label));
		}
	}
}