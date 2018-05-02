import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edges[][]= {{0,3},{1,3},{2,3},{4,3},{5,4}};
		//int edges[][]= {{1,0},{1,2},{1,3}};
		//int edges[][]= {};
		//int edges[][]= {{0,1},{0,2},{0,3},{3,4},{4,5}};
		int i;
		Solution s=new Solution();
		List<Integer> ans=s.findMinHeightTrees(6, edges);
		for(i=0;i<ans.size();i++)
			System.out.println(ans.get(i));
	}

}
