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
    List<Integer> l=new ArrayList<>();
    int ans=0;
    public int sumNumbers(TreeNode root) {
        
        getPath(root);
        
        return ans;
        
    }
    
    public void getPath(TreeNode root)
    {
        if(root==null)
            return;
        
        if(root.left==null && root.right==null)
        {
            l.add(root.val);
            ans+=getVal(new ArrayList<Integer>(l));  
            l.remove(l.size()-1);
        }
        l.add(root.val);
        
        getPath(root.left);
        getPath(root.right);
        l.remove(l.size()-1);
    }
    
    public int getVal(List<Integer> l)
    {
        String str="";
        for(Integer x:l)
        {
           str=str+x; 
        }
        
        return Integer. valueOf(str);
    }
}