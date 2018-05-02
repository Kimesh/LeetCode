class Solution {
    public int subarraySum(int[] a, int k) {
        int count=0,sum=0,i,j,n;
        n=a.length;
        i=0;
        j=0;
        
        while(i<n  && j<n)
        {
            sum=sum+a[i];
            while(sum==k && j<=i)
            {
                count++;
                sum=sum-a[j];
                j++;
            }
            i++;
        }
        if(j==n-1)
            j++;
        while(j<n-1)
        {
//            if(a[j]<0 && sum<0)
//            sum=sum+a[j];
//            else
                sum=sum-a[j];
            
            if(sum==k)
                count++;
            j++;
        }
        return count;
    }
}