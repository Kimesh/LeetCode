
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode s=new TreeNode(3);
		s.left=new TreeNode(4);
		s.right=new TreeNode(5);
		s.left.left=new TreeNode(1);
		s.left.right=new TreeNode(2);
		
		TreeNode t=new TreeNode(4);
		t.left=new TreeNode(1);
		t.right=new TreeNode(2);
		
		TreeNode t1=new TreeNode(1);
		t1.left=new TreeNode(1);
		TreeNode t2=new TreeNode(2);
		Solution sol=new Solution();
		System.out.println(sol.isSubtree(s, t));
		
		
	}

}
