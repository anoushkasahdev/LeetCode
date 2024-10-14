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
     List<List<Integer>> ans=new ArrayList<>();
    List<Integer> l=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       
       getPathSum(root,targetSum);
        // System.out.println(ans.size());
          //System.out.println(l.size());
       return ans;
            
        
    }
    
   public void getPathSum(TreeNode root,int targetSum)
    {
       if(root==null)
            return;
         
        if(root.left==null && root.right==null && root.val==targetSum)
        {
           l.add(root.val);      
            ans.add(new ArrayList<Integer>(l));  
            l.remove(l.size()-1);       
        }
     

        l.add(root.val);
        
     
      
       getPathSum(root.left,targetSum-root.val);
       getPathSum(root.right,targetSum-root.val);
       l.remove(l.size()-1);
        
    }
}