class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
            return Math.max(nums[0],nums[1]);
        return Math.max(call(0,nums.length-2,nums),call(1,nums.length-1,nums));
        
        
    }
    private int call(int start,int n,int nums[])
    {  
        int dp[]=new int[nums.length];
        dp[start]=nums[start];
        dp[start+1]=Math.max(nums[start],nums[start+1]);
        for(int i=2+start;i<=n;i++)
        {
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        
        
        return dp[n];
        
        
        
        
        
    }
}