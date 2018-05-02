
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UndirectedGraphNode zero=new UndirectedGraphNode(0);
		UndirectedGraphNode one=new UndirectedGraphNode(1);
		UndirectedGraphNode two=new UndirectedGraphNode(2);
		
		zero.neighbors.add(one);
		zero.neighbors.add(two);
		one.neighbors.add(zero);
		one.neighbors.add(two);
		two.neighbors.add(zero);
		two.neighbors.add(one);
		two.neighbors.add(two);
		
		Solution s=new Solution();
		UndirectedGraphNode root=s.cloneGraph(zero);
		root=root.neighbors.get(2);
		for(int i=0;i<root.neighbors.size();i++)
			System.out.println(root.neighbors.get(i).label);
	}

}
