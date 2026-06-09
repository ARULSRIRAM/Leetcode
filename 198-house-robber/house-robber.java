class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return house(nums.length-1,nums,dp);
    }
    // public int house(int n,int[] nums){
    //     if(n<0)return 0;
    //     int steal=nums[n]+house(n-2,nums);
    //     int notsteal=house(n-1,nums);
    //     return Math.max(steal,notsteal);
    // }
     public int house(int n,int[] nums,int[] dp){
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        int steal=nums[n]+house(n-2,nums,dp);
        int notsteal=house(n-1,nums,dp);
        return dp[n]=Math.max(steal,notsteal);
    }
    
}