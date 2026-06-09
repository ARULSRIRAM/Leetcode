class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0;
        int minLength=Integer.MAX_VALUE;
        int length=0;
        int sum=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>=target){
                length=r-l+1;
                minLength=Math.min(minLength,length);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return (minLength==Integer.MAX_VALUE)?0:minLength;

    }
}