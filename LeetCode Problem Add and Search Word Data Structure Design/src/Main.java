
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WordDictionary wordDict=new WordDictionary();
		wordDict.addWord("bad");
		wordDict.addWord("dad");
		wordDict.addWord("mad");
		System.out.println(wordDict.search("pad"));
		System.out.println(wordDict.search("bad"));
		System.out.println(wordDict.search(".ad"));
		System.out.println(wordDict.search("b.."));
		
	}

}
