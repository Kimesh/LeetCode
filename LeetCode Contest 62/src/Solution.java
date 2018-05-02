class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
    	
    	int i,j,k,n;
    	n=letters.length;
    	
    	if(n==0)
    		return target;
    	for(i=0;i<n;i++)
    	{
    		if(letters[i]>target)
    			return letters[i];
    	}
        return letters[0];
    }
}