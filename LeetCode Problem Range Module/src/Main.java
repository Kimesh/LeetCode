
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RangeModule range=new RangeModule();
		range.addRange(10, 20);
		range.removeRange(15,20);
//		System.out.println(range.queryRange(10, 14));
//		System.out.println(range.queryRange(13, 15));
//		System.out.println(range.queryRange(16, 17));
		
		range.traverseMap();
		
	}

}
