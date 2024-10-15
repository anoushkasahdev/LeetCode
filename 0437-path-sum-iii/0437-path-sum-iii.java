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
    Map<Long,Integer> mpp=new HashMap<>();
    public int pathSum(TreeNode root, int targetSum) {

        long pref=0;

        DFS(root,pref,targetSum);

        return count;
        
    }

    public void DFS(TreeNode root,long pref ,int x)
    {
        if(root==null)
        return;

        pref=pref+root.val;

        if(mpp.containsKey(pref-x))
        {
            count+=mpp.get(pref-x);
        }

        if(x==pref)
        count++;

        mpp.put(pref, mpp.getOrDefault(pref,0)+1);

        DFS(root.left,pref,x);
        DFS(root.right,pref,x);    

        mpp.put(pref,(mpp.get(pref)-1));   

    }
}