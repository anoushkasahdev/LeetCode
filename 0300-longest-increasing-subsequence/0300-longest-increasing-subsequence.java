class Solution {
    public int lengthOfLIS(int[] nums) {
        
        //using DP
        
        int n=nums.length;
        int dp[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            dp[i]=1;
        }

        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        
        int res=1;
        
        for(int i=0;i<n;i++)
        {
           // System.out.println(dp[i]);
            res=Math.max(res,dp[i]);
        }
        
        return res;
        
    }
}