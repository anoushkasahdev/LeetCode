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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<>();
        
        if(root==null)
            return ans;
        
       Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        int counter=0;
       boolean leftToRight=true;
        
        while(!q.isEmpty())
        {
            int levelSize=q.size();
            List<Integer> list=new ArrayList<>();
            
            for(int i=0;i<levelSize;i++)
            {
                TreeNode curr=q.remove();
                list.add(curr.val);
                
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
                
            }
            
            
            
            if(counter%2==0)
                leftToRight=true;
            else
                leftToRight=false;
            
            if(leftToRight==false)
            {
                Collections.reverse(list);
            }
            
            ans.add(list);
            
            counter++;
           // System.out.println(counter);
            
            
        }
        
        return ans;
        
        
        
        
        
        
        
        
    }
    
    
}