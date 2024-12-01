class Solution {
    public int coinChange(int[] coins, int amount) {
        int n= coins.length;

        int dp[][]=new int[n+1][amount+1];

        for(int i=1;i<=amount;i++)
        {
            dp[0][i]=Integer.MAX_VALUE-1;
        }
        System.out.println(dp[0][0]);

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=amount;j++)
            {
                if(coins[i-1]>j)
                {
                    dp[i][j]=dp[i-1][j];
                }
                else
                {
                    dp[i][j]=Math.min(dp[i-1][j], (1+dp[i][j-coins[i-1]]));
                }
            }
        }

        return dp[n][amount]==Integer.MAX_VALUE-1 ? -1 : dp[n][amount];
    }
}