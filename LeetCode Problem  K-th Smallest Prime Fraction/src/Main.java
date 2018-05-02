
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,5};
		Solution s=new Solution();
		int ans[]=s.kthSmallestPrimeFraction(a, 3);
		
		System.out.println(ans[0]+" "+ ans[1]);
	}

}
