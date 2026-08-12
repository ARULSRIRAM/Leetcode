class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        // dp[i] - Length of LIS till index i
        int ans=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            ans=Math.max(ans,dp[i]);
        }     
        return ans;
    }


    //Memoization
    // public int lengthOfLIS(int[] nums) {
    //     int n=nums.length;
    //     int[][] dp=new int[n][n-1];
    //     for(int[] rows:dp){
    //         Arrays.fill(rows,-1);
    //     }
    //     return LIS(0,-1,nums,dp);
    // }
    // public static int LIS(int i,int prev,int[] nums,int[][] dp){
    //     if(i == nums.length)return 0;
        
    //     if(prev != -1 && dp[i][prev]!=-1){
    //         return dp[i][prev];
    //     }
    //     int pick=0;
    //     if(prev == -1 || nums[i]>nums[prev]){
    //         pick=1+LIS(i+1,i,nums,dp);
    //     }
    //     int notpick=LIS(i+1,prev,nums,dp);
    //     if(prev!=-1)
    //     return dp[i][prev]=Math.max(pick,notpick);
    //     else return Math.max(pick,notpick);
    // }
}