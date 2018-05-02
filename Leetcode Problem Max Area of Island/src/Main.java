
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grid[][]= {{1,0,0,0,0},{1,1,0,1,0},{0,0,0,1,1},{0,0,0,1,1}};
	//	int grid[][]= {{1}};
	//	int grid[][]= {{0,1},{1,1}};
		Solution s=new Solution();
		System.out.println(s.maxAreaOfIsland(grid));
	}

}
