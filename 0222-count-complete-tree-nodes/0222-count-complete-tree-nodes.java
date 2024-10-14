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
    int count=0;
    public int countNodes(TreeNode root) {
        
        //can do any traversal
        //1. directly increment the count
        //2. store all nodes in a lost and return size of list at last
        
        inorder(root);
        return count;
        
    }
    
    public void inorder(TreeNode root)
    {
        if(root==null)
            return;
        
        inorder(root.left);
        count++;
        inorder(root.right);
    }
}