import java.util.Set;
import java.util.TreeMap;

class RangeModule {

	TreeMap<Integer, Integer> map;
	
	public RangeModule() {
        map=new TreeMap<Integer,Integer>();
    }
    
    public void addRange(int left, int right) {
        if(map.isEmpty())
        {
        	map.put(left, right);
        	return;
        }
        	
        //complete overlap case
        
        Integer lowerLeftKey=map.floorKey(left);
        Integer lowerRightKey=map.floorKey(right);
        if(lowerLeftKey==null && lowerRightKey==null)
        {
        	map.put(left, right);
        	return;
        }
        else if(lowerLeftKey==null && lowerRightKey!=null)
        {
        	map.put(left, Math.max(right, map.get(lowerRightKey)));
        	map.remove(lowerRightKey);
        	return;
        }
        else if(lowerLeftKey!=null && lowerRightKey!=null)
        {
        	Integer rightKeyOfLowerLeftKey=map.get(lowerLeftKey);
        	if(lowerLeftKey<=left && rightKeyOfLowerLeftKey<=left)
        		map.put(left, right);
        	else if(lowerLeftKey<=left && rightKeyOfLowerLeftKey>left)
        	{
        		map.remove(lowerLeftKey);
        		map.put(Math.min(lowerLeftKey, left), Math.max(rightKeyOfLowerLeftKey, right));
        		return;
        	}
        }
//        Integer rightKeyOfLowerLeftKey=map.get(lowerLeftKey);
//        if(rightKeyOfLowerLeftKey>=right)
//        	return;
    }
    
    public boolean queryRange(int left, int right) {
    	 Integer lowerLeftKey=map.floorKey(left);
         Integer lowerRightKey=map.floorKey(right);
         if(lowerLeftKey!=null)
         {
        	 Integer rightKeyOfLowerLeftKey=map.get(lowerLeftKey);
        	 if(lowerLeftKey<=left && rightKeyOfLowerLeftKey>=right)
        		 return true;
         }
        return false;
    }
    
    public void removeRange(int left, int right) {
    	 Integer lowerLeftKey=map.floorKey(left);
         Integer lowerRightKey=map.floorKey(right);
         if(lowerLeftKey==null && lowerRightKey==null )
         	return;
         else if(lowerLeftKey==null && lowerRightKey!=null)
         {
        	 Integer rightKeyOfLowerRightKey=map.get(lowerRightKey);
        	 if(lowerRightKey!=right)
        	 {
        		 map.remove(lowerRightKey);
        		 map.put(right, rightKeyOfLowerRightKey);
        		 return;
        	 }
         }
         else if(lowerLeftKey!=null && lowerRightKey!=null)
         {
        	 Integer rightKeyOfLowerRightKey=map.get(lowerRightKey);
        	 
        	 if(left>lowerLeftKey && right<rightKeyOfLowerRightKey)
        	 {
        		 map.remove(lowerLeftKey);
        		 map.put(lowerLeftKey, left);
        		 map.put(right, rightKeyOfLowerRightKey);
        	 }
        	 else if(left==lowerLeftKey && right==rightKeyOfLowerRightKey)
        		 map.remove(lowerLeftKey);
        	 else if(left==lowerLeftKey && rightKeyOfLowerRightKey>right)
        	 {
        		 map.remove(lowerLeftKey);
        		 map.put(right, rightKeyOfLowerRightKey);
        		 
        	 }
        	 else if(left>lowerLeftKey && right>=rightKeyOfLowerRightKey)
        		 map.replace(lowerLeftKey, left);
         }
         
    }
    
    public void traverseMap()
    {
    	Set<Integer> set=map.keySet();
    	for(Integer i: set)
    		System.out.println(i+" , "+map.get(i));
    }
}

/**
 * Your RangeModule object will be instantiated and called as such:
 * RangeModule obj = new RangeModule();
 * obj.addRange(left,right);
 * boolean param_2 = obj.queryRange(left,right);
 * obj.removeRange(left,right);
 */