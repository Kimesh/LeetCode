import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findLongestChain(int[][] pairs) {
    	int i,j,max=1,n;
    	
    	n=pairs.length;
    	
    	int a[]=new int[n];
    	Arrays.fill(a, 1);
    	
    	Arrays.sort(pairs, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0]-o2[0];
			}
    		
		});
    	for(i=1;i<n;i++)
    	{
    		for(j=0;j<i;j++)
    		{
    			if(pairs[j][1]<pairs[i][0] && a[i]<a[j]+1)
    			{
    				a[i]=a[j]+1;
    				if(a[i]>max)
    					max=a[i];
    			}
    		}
    	}
        return max;
    }
}