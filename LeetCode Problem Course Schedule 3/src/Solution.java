import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int scheduleCourse(int[][] a) {
    	int i,count=0,time=0;
    	Arrays.sort(a, new Comparator<int[]>() {
            
            @Override             
            // Compare values according to columns
            public int compare(final int[] entry1, 
                               final int[] entry2) {
   
              // To sort in descending order revert 
              // the '>' Operator
              if (entry1[1] > entry2[1])
                  return 1;
              else if(entry1[1]==entry2[1])
              {
            	  if(entry1[0]>entry2[0])
            		  return 1;
            	  else if(entry1[0]==entry2[0])
            		  return 0;
            	  else 
            		  return -1;
              }
              else
                  return -1;
            }
          });
    	
    	
    	for(i=0;i<a.length;i++)
    	{
    		if(a[i][1]>=time+a[i][0]) {
    			time=time+a[i][0];
    			count++;
    		}
    	}
        return count;
    }
}