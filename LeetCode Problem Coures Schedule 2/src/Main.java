
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int a[][]= {{1,0},{0,1}};
		Solution s=new Solution();
		int b[]=s.findOrder(2, a);
		for(i=0;i<b.length;i++)
			System.out.println(b[i]);
		//System.out.println(s.canFinish(5, a));
		}

}
