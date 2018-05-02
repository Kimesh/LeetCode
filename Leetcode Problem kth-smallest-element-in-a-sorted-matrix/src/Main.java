import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,2},{1,3}};
		System.out.println(kthSmallest(a, 2));
		
	}

	 public static int kthSmallest(int[][] matrix, int k) {
		 
		 int n=matrix.length;
		
		 if(n==0)
			 return 0;
		 int i,j,index_i,index_j;
		 
		 
		 PriorityQueue<Node> queue=new PriorityQueue<>();
		 for(j=0;j<n;j++)
			 queue.add(new Node(matrix[0][j],0,j));
		 //	System.out.println(n);
		 for(i=0;i<k-1;i++)
		 {
			 Node x=queue.poll();
			 index_i=x.index_i;
			 index_j=x.index_j;
			 
			 if(index_i<n-1)
				 queue.add(new Node(matrix[index_i+1][index_j],index_i+1,index_j));
		 }
		 	
		 
		 return queue.poll().val;
	    }
}

class Node implements Comparable<Node>{
	int val;
	int index_i;
	int index_j;
	public Node(int val, int index_i, int index_j) {
	//	super();
		this.val = val;
		this.index_i = index_i;
		this.index_j = index_j;
	}
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if(this.val<o.val)
			return -1;
		else if(this.val==o.val)
			return 0;
		else
		return 1;
	}
}