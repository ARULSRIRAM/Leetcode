class Solution {
    public boolean canPartition(int[] nums) {
        int totalsum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        if(totalsum%2 == 1)return false;

        int sum  = totalsum/2;
        Boolean[][] dp=new Boolean[n][sum+1];
        return subSum(n-1,sum,nums,dp);
    }
    public static boolean subSum(int i,int sum,int[] arr,Boolean[][] dp){
        if(sum == 0)return true;
        if(i==0)return (arr[0] == sum)? true:false;
        if(dp[i][sum]!=null)return dp[i][sum];
        boolean pick=false;
        if(arr[i]<=sum){
            pick=subSum(i-1,sum-arr[i],arr,dp);
        }
        boolean notpick=subSum(i-1,sum,arr,dp);
        
        return dp[i][sum] = pick || notpick;
    } 
}
