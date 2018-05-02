
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(3);
		root.right=new TreeNode(9);
		BSTIterator itr=new BSTIterator(root.left);
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int x) {
		val = x;
	}
}

