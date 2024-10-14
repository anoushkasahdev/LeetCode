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
    List<Integer>l1=new ArrayList<>();
    List<Integer> l2=new ArrayList<>();
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        func(root1,l1);
        func(root2,l2);
        
        if(l1.equals(l2))
            return true;
        
        return false;
        
    }
    
    public void func(TreeNode root,List<Integer> l)
    {
        if(root==null)
            return;
        
        if(root.left==null && root.right==null)
        {
            l.add(root.val);
        }
        
        func(root.left,l);
        func(root.right,l);
    }
}