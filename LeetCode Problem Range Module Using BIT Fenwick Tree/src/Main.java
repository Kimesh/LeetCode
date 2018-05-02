
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,5};
		NumArray s=new NumArray(a);
		System.out.println(s.sumRange(0, 2));
		s.update(1, 2);
		System.out.println(s.sumRange(0, 2));
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
