class Solution {
	int count2=0;
    public boolean isIdealPermutation(int[] a) {
    	int i,j,count1=0;
    	int n=a.length;
    	for(i=0;i<n-1;i++)
    	{
    		if(a[i]>a[i+1])
    			count1++;
    	}
    	
    	MergeSort(a,0,n-1);
    	for(i=0;i<n;i++)
    		System.out.println(a[i]);
    	if(count1==count2)
        return true;
    	else
    		return false;
    }

	private void MergeSort(int[] a, int l, int u) {
		
		if(l<u)
		{
			int mid=(l+u)/2;
			int i;
			int left[]=new int[mid-l+1];
			int right[]=new int[u-mid-1];
			for( i=0;i<=mid;i++)
				left[i]=a[i];
			for(;i<u;i++)
				right[i-mid-1]=a[i];
			
			MergeSort(left,l,mid);
			MergeSort(right,mid+1,u);
			Merge(a,left,right,left.length,right.length);
		}
	}

	private void Merge(int[] a, int[] left, int[] right, int l1, int l2) {
		int i,j,k;
		i=0;
		j=0;
		k=0;
		
		while(i<l1 && j<l2)
		{
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				i++;
			}
			else
			{
				a[k]=right[j];
				count2++;
				j++;
			}
				k++;
		}
		
		while(i<l1)
		{
			a[k]=left[i];
			k++;
			i++;
		}
		while(j<l2)
		{
			a[k]=left[j];
			k++;
			j++;
		}
	}
}