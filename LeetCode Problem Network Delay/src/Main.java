
public class Main {

	public static void main(String[]args)

	{
		// TODO Auto-generated method stub

//		int a[][] = { { 4, 2, 76 }, { 1, 3, 79 }, { 3, 1, 81 }, { 4, 3, 30 }, { 2, 1, 47 }, { 1, 5, 61 }, { 1, 4, 99 },
//				{ 3, 4, 68 }, { 3, 5, 46 }, { 4, 1, 6 }, { 5, 4, 7 }, { 5, 3, 44 }, { 4, 5, 19 }, { 2, 3, 13 },
//				{ 3, 2, 18 }, { 1, 2, 0 }, { 5, 1, 25 }, { 2, 5, 58 }, { 2, 4, 77 }, { 5, 2, 74 } };

		int a[][]= {{2,1,1},{2,3,1},{3,4,1}};
		//int a[][]= {{1,2,1}};
		Solution s = new Solution();
		//System.out.println(s.networkDelayTime(a, 5, 3));
	//	System.out.println(s.networkDelayTime(a, 2, 2));
		System.out.println(s.networkDelayTime(a, 4, 2));
	}
}
// From 3->1 path is 3->5->4->1(59 weight) 
