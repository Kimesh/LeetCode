
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {-2, 0, 3, -5, 2, -1};
		NumArray s=new NumArray(a);
		System.out.println(s.sumRange(0, 2));
		System.out.println(s.sumRange(2, 5));
		System.out.println(s.sumRange(0,5));
	}

}
