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
    List<Integer> list=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        
        
         helper(root,0);
        
        return list;
        
    }
    
    public void helper(TreeNode root,int level)
    {
        if(root==null)
            return;

        if(list.size()==level)
        {
            list.add(root.val);
        }

        helper(root.right,level+1);
        helper(root.left,level+1);
        
        
        
    }
}