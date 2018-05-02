/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if((s!=null && t!=null && s.val==t.val)|| (s==null && t==null))
        {
        	boolean flag=check(s,t);
        	if(flag)
        	return flag;
        	else
        		return isSubtree(s.left, t) || isSubtree(s.right, t);
        }
        else if(s==null && t!=null || s!=null && t==null)
        	return false;
        else
    	return isSubtree(s.left, t) || isSubtree(s.right, t);	
    }

	private boolean check(TreeNode s, TreeNode t) {
		if((s!=null && t!=null && s.val==t.val))
			return check(s.left,t.left) && check(s.right, t.right);
		else if(s==null && t==null)
			return true;
		return false;
	}
}