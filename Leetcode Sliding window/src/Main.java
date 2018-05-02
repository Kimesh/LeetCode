import java.util.Collections;
import java.util.PriorityQueue;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,3,3,3,2};
		
		int b[]=maxSlidingWindow(a,2);
	}
	public static int[] maxSlidingWindow(int[] nums, int k) {
		
		int i,j,n;
		n=nums.length;
		int size=n-k+1;
		int a[]=new int[size];
	
		
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(i=0;i<k-1;i++)
			queue.add(nums[i]);
		
		j=0;
		for(i=k-1;i<n;i++,j++)
		{
			queue.add(nums[i]);
			a[j]=queue.peek();
			System.out.println(a[j]);
			queue.remove(nums[i-(k-1)]);
		}
     return a;   
    }

}
