import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

class Solution {
    public int smallestDistancePair(int[] a, int k) {
    	int temp=0,i=0,j = 0,n,count=0,key,value,min=Integer.MAX_VALUE;
    	
    	n=a.length;
    
    	TreeMap<Integer, Integer> map=new TreeMap<>();
    	
    	for(i=0;i<n;i++)
    	{
    		if(map.containsKey(a[i]))
    			map.put(a[i], map.get(a[i])+1);
    		else
    			map.put(a[i], 1);
    	}
    	
    	count=0;
    	 for(Map.Entry m:map.entrySet()){  
    		 if(count==0)
    		 {
    			  key=(int) m.getKey();
        		  value=(int) m.getValue();
    		 }
    		 else
    		 {
    			 if(Math.abs(arg0))
    		 }
    		 count++;
    	 }
    	 
    	 return 0;
}
}