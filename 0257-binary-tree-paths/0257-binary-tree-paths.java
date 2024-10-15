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
    List<String> ans=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        String str="";
        func(root,str);        
        return ans;               
    }
    
    public void func(TreeNode root,String str)
    {
        if(root==null)
            return;
        
        if(root.left==null && root.right==null)
        {
            
            ans.add(str+root.val);
            
            //break;
        }
        else
        str+=root.val+"->";
        
        func(root.left,str);
        func(root.right,str);
    }    
    
}