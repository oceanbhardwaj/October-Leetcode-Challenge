class Solution {
    public boolean winnerSquareGame(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
        
    }
    private boolean helper(int n,int []dp)
    {
        if(n==0)
            return false;
        if(dp[n]!=-1)
        return dp[n]==1?true:false;
        for(int i=1;i*i<=n;i++)
        {
            if(!helper(n-i*i,dp))
            {
                dp[n]=1;
                return true;
            }
        }
        dp[n]=0;
        return false;
    }
}