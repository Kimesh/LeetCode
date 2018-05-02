import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s=new Solution();
		String words[]= {"i", "love", "leetcode", "i", "love", "coding"};
		String word[]= {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
		List<String> list=s.topKFrequent(words, 2);
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}

}
