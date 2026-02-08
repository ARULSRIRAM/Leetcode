class Solution {
    public int alternatingSum(int[] nums) {
        if(nums.length==1)return nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=((i&1)==0)?nums[i]:-nums[i];
        }
        return sum;
    }
}