import java.util.HashMap;

class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    	
    	int arr1[]=new int[A.length*B.length];
    	int arr2[]=new int[C.length*D.length];
    	
    	int i,j,k;
    	int count=0;
    	
    	HashMap<Integer, Integer> hashMap=new HashMap<>();
    	
    	
    	k=0;
    	for(i=0;i<A.length;i++)
    	{
    		for(j=0;j<B.length;j++)
    		{
    			arr1[k++]=A[i]+B[j];
        		hashMap.put(arr1[k-1], hashMap.getOrDefault(arr1[k-1], 0)+1);
    		}
    	}
    	k=0;
    	for(i=0;i<C.length;i++)
    	{
    		for(j=0;j<D.length;j++)
    			arr2[k++]=C[i]+D[j];
    	}
    	
    	for(i=0;i<arr2.length;i++)
    	{
    		if(hashMap.containsKey(-arr2[i]))
    			count+=hashMap.get(-arr2[i]);
    	}
    	return count;
    }
}