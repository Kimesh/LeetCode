import java.util.Stack;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {

	Stack<TreeNode> stack;
	TreeNode current;
    public BSTIterator(TreeNode root) {
    	current=root;
    	stack=new Stack<>();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
    	if(current==null && stack.isEmpty())
    		return false;
    	else
    	{
    		while(current!=null)
    		{
    			stack.push(current);
    			current=current.left;
    		}
    		return true;
    	}
    }

    /** @return the next smallest number */
    public int next() {
    	current=stack.peek().right;
    	return stack.pop().val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */