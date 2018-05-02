class Solution {
    public String getHint(String secret, String guess) {
    	int i,n,bulls = 0,cows=0;
    	char c;
    	int a[]=new int[10];
    	n=secret.length();
    	
    	for(i=0;i<n;i++)
    	{
    		c=secret.charAt(i);
    		if(c==guess.charAt(i))
    			bulls++;
    		else
    		a[c-'0']++;
    	}
    	for(i=0;i<n;i++)
    	{
    		 c=guess.charAt(i);
    		if(c!=secret.charAt(i) && a[c-'0']>0)
    		{
    			cows++;
    			a[c-'0']--;
    		}
    	}
        return bulls+"A"+cows+"B";
    }
}