import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k;
		Solution s=new Solution();
		//int buildings[][]= {{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}};
		//int buildings[][]= {{1,7,10},{3,7,5}};
		//int buildings[][]= {{1,3,5},{3,7,10}};
		int buildings[][]= {{1,3,5}};
		List<int[]> list=s.getSkyline(buildings);
		System.out.println("Answer: ");
		for(i=0;i<list.size();i++)
		{
			int [] temp=list.get(i);
			System.out.println(temp[0]+" : "+temp[1]);
		}
	}

}
