import java.util.Collection;
import java.util.HashMap;

class TrieNode{
	boolean flag;
	HashMap<Character, TrieNode> map=new HashMap<>();
}
class WordDictionary {

	TrieNode root;
	
    /** Initialize your data structure here. */
    public WordDictionary() {
    	root=new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
    	TrieNode p=root;
    	for(int i=0;i<word.length();i++)
    	{
    		char c=word.charAt(i);
    		if(!p.map.containsKey(c))
    			p.map.put(c, new TrieNode());
    		p=p.map.get(c);
    	}
    	p.flag=true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return searchHelper(word,root,0,word.length());
    }

	private boolean searchHelper(String word, TrieNode root, int index, int n) {

		if(index==n)
			return root.flag;
		char c=word.charAt(index);
		if(c!='.')
		{
			if(root.map.containsKey(c))
				return searchHelper(word, root.map.get(c), index+1, n);
			else
				return false;
		}
		else
		{
			Collection<TrieNode> collection=root.map.values();
			//System.out.println(root.map.keySet());
			for(TrieNode node:collection)
			{
			//	System.out.println();
				if(searchHelper(word, node, index+1, n))
				return true;
			}
		}
		return false;
	}
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */