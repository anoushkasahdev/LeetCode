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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while(root!=null)
        {
            if(root.val<p.val && root.val<q.val)
            {
                //lies in right side
                root=root.right;
            }
            else if(root.val>p.val && root.val>q.val)
            {
                //lies in left side
                root=root.left;
            }
            else
            {
                break;
            }
        }

        return root;
               
    }
}