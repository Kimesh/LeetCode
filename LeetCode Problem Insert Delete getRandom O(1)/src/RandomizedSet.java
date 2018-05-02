import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

class RandomizedSet {

	HashSet<Integer> hashSet;
	Random random;
	/** Initialize your data structure here. */
    public RandomizedSet() {
        hashSet=new HashSet<>();
        random=new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        	if(!hashSet.contains(val))
        	{
        		hashSet.add(val);
        		return true;
        	}
    	return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
    	if(hashSet.contains(val))
    	{
    		hashSet.remove(val);
    		return true;
    	}
	return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
    	ArrayList<Integer> list=new ArrayList<Integer>(hashSet);
    	int val=random.nextInt(hashSet.size());
    	return list.get(val);
    	//return list.get(val);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */