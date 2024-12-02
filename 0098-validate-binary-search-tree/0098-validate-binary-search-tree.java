/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    long prevVal=Long.MIN_VALUE;
    boolean ans=true;
    public boolean isValidBST(TreeNode root) {

      inorder(root);
      return ans;    
    }

    public void inorder(TreeNode root)
    {
        if(root==null)
        return;

        inorder(root.left);

        if(prevVal>=root.val)
        ans=false;

        prevVal=root.val;

        inorder(root.right);

    }
}