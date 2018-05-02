class Solution {
    public int findLength(int[] A, int[] B) {
    	
    	int i,j,nA,nB,max=0,k,l;
    	nA=A.length;
    	nB=B.length;
    	
    	int a[][]=new int[nA+1][nB+1];
    	for(i=1;i<=nA;i++)
    	{
    		for(j=1;j<=nB;j++)
    		{
    			if(A[i-1]==B[j-1])
    				a[i][j]=a[i-1][j-1]+1;
    			else
    				a[i][j]=0;
    			
    			if(a[i][j]>max)
    				max=a[i][j];
    		}
    	}
    	
    	return max;
    }
}