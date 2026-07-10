class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
         if(nums.length==1)return nums[0];
        return rob(nums.length-1,nums,dp);
    }
    int rob(int n,int[]nums,int[] dp){
    
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int j=2;j<=n;j++){
            dp[j]=Math.max(dp[j-2]+nums[j],dp[j-1]);
        }
        return dp[n];
    }
}