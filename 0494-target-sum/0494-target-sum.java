class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        int n=nums.length;
        int sum=0;

        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
        }

        if(Math.abs(target)>sum)
        return 0;

        if((sum+target)%2!=0)
        return 0;

        int t=(sum+target)/2;

        int dp[][]=new int[n+1][t+1];

        for(int i=0;i<n;i++)
        {
            dp[i][0]=1;
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=t;j++)
            {
                if(nums[i-1]>j)
                {
                    dp[i][j]=dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j] + dp[i-1][j-nums[i-1]];
                }
            }
        }

        return dp[n][t];
        
    }
}