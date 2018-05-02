import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int maxEnvelopes(int[][] envelopes) {
    	int n,i,j,max=1;
    	n=envelopes.length;
    	if(n==0)
    		return 0;
    	int envelopCount[]=new int[n];
    	Arrays.fill(envelopCount, 1);
    	Arrays.sort(envelopes, new Comparator<int[]>() {

			@Override
			public int compare(int[] arr1, int[] arr2) {
				if(arr1[0]!=arr2[0])
					return arr1[0]-arr2[0];
				else 
					return arr1[1]-arr2[1];
			}
		});
    	
    	for(i=1;i<n;i++)
    	{
    		for(j=0;j<i;j++)
    		{
    			if(envelopes[i][0]>envelopes[j][0] && envelopes[i][1]>envelopes[j][1] && envelopCount[i]<envelopCount[j]+1)
    				envelopCount[i]++;
    		}
    	}
    	
    	max=1;
    	for(i=0;i<n;i++)
    	{
    		if(envelopCount[i]>max)
    			max=envelopCount[i];
    	}
     return max;   
    }
}