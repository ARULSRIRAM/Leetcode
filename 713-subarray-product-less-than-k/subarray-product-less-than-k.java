class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0 || k==1)return 0;
        int prod=1;
        int l=0,r=0;
        int count=0;
        while(r<nums.length){
            prod*=nums[r];
            while(k<=prod){
                prod/=nums[l];
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
}