import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

class Solution {
    public boolean canCross(int[] a) {
    	
    	int i,j,k,n;
    	n=a.length;
    	List<HashSet<Integer>> list=new ArrayList<HashSet<Integer>>();
    	HashSet<Integer> hashSet=new HashSet<>();
    	hashSet.add(0);
    	list.add(hashSet);
    	
    	
    	for(i=1;i<n;i++)
    	{
    		HashSet<Integer> hash=new HashSet<>();
    		for(j=Math.min(i/2, i-3);j<list.size();j++)
    		{
    			if(j<0)
    				continue;
    			HashSet<Integer> temp=list.get(j);
    			Iterator<Integer> itr=temp.iterator();
    			while(itr.hasNext())
    			{
    				Integer integer=itr.next();
    				if(integer-1==a[i]-a[j])
    					hash.add(integer-1);
    				else if(integer==a[i]-a[j])
    					hash.add(integer);
    				else if(integer+1==a[i]-a[j])
    					hash.add(integer+1);
    				
    				if(integer-1 >=n || integer>=n || integer+1>=n)
    					return true;
    			}
    		}
    		list.add(hash);
    	}
    	
    	if(list.get(list.size()-1).isEmpty())
        return false;
    	return true;
    }
}