
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s=new Solution();
		//int edges[][]= {{1,2},{2,3},{3,4},{4,1},{1,5}};
	//	int edges[][]= {{3,4},{1,2},{2,4},{3,5},{2,5}};
		int edges[][]= {{1,2},{1,3},{2,3}};
		int a[]=s.findRedundantDirectedConnection(edges);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
