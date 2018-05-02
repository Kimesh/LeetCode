/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
       return BinarySearch(1,n);
}
    private int BinarySearch(long l, long u)
    {
        if(l<=u)
        {
        
            int mid=(int) (((long)(l+u))/2);
            int val=guess(mid);
            if(val==0)
                return mid;
            else if(val==-1)
            {
              //  System.out.println(mid);
                return BinarySearch(l,mid);
            }
                
            else if(val==1)
            {
              //  System.out.println(mid);
                return BinarySearch(mid+1,u);
            }
                
        }
        return -1;
    }
	
}