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
    TreeNode parentX=null;
    TreeNode parentY=null;
    int levelX=0;
    int levelY=0;
    public boolean isCousins(TreeNode root, int x, int y) {

        helper(root,null,0,x,y);

        return parentX!=parentY && levelX==levelY;
        
    }

    public void helper(TreeNode node,TreeNode parent,int level,int x,int y)
    {
        if(node==null)
        return;

        if(node.val==x)
        {
            parentX=parent;
            levelX=level;
        }
        if(node.val==y)
        {
            parentY=parent;
            levelY=level;

        }

        helper(node.left,node,level+1,x,y);
        helper(node.right,node,level+1,x,y);

    }
}