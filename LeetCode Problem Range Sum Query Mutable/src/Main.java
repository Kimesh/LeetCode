
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {9,-8};
		NumArray numArray=new NumArray(a);
		numArray.update(0, 3);
		System.out.println(numArray.sumRange(1, 1));

		System.out.println(numArray.sumRange(0, 1));
	}

}
