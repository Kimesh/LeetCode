import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public int leastInterval(char[] tasks, int k) {
       
    	int a[]=new int[26];
    	HashSet<Integer> hash=new HashSet<>();
    	int i,j,start,n,max=Integer.MIN_VALUE;
    	n=tasks.length;
    	
    	if(k==0)
    		return n;
    	
    	for(i=0;i<n;i++)
    		a[tasks[i]-'A']=a[tasks[i]-'A']+1;
    	
    	Arrays.sort(a);
    	start=1;
    	while(a[25]!=0)
    	{
    		hash.add(start);
    		if(start>max)
    			max=start;
    		start=start+(k+1);
    		a[25]--;
    	}
    	
    	start=1;
    	
    	for(i=a.length-2;i>=0;i--)
    	{
    		int count=0;
    		while(a[i]!=0)
    		{
    			while(hash.contains(start))
    			{
    				if(count==0)
    					start++;
    				else
    					start=start+(k+1);
    			}

    			if(count==0)
    				count=1;
    			
    			hash.add(start);
    			if(start>max)
    				max=start;
    			a[i]--;
    		}
    	}
    	return max;
    }
}