class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;
        for(int i=0;i<nums.length;i++){
            int sum=cursum+nums[i];
            cursum=Math.max(sum,nums[i]);
            maxsum=Math.max(cursum,maxsum);
        }
        return maxsum;
    }
}