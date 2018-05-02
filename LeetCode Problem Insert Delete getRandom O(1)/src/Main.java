
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomizedSet randomSet = new RandomizedSet();
		System.out.println(randomSet.insert(-1));
		System.out.println(randomSet.remove(-2));
		System.out.println(randomSet.insert(-2));
		System.out.println(randomSet.getRandom());
		System.out.println(randomSet.remove(-1));
		System.out.println(randomSet.insert(-2));
		System.out.println(randomSet.getRandom());
	}

}
