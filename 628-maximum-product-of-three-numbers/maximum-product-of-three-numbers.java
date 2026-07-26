class Solution {
    public int maximumProduct(int[] nums) {
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;
        int fmin=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>fmax){
                tmax=smax;
                smax=fmax;
                fmax=nums[i];
            }
            else if(fmax>=nums[i] && smax<nums[i]){
                tmax=smax;
                smax=nums[i];
            }
            else if(fmax>=nums[i] && smax>=nums[i] && nums[i] >tmax){
                tmax=nums[i];
            }
            if(nums[i]<fmin){
                smin=fmin;
                fmin=nums[i];
            }
            else if(fmin<=nums[i] && smin>nums[i]){
                smin=nums[i];
            }
        }
        int val1=fmax*smax*tmax;
        int val2=fmax*fmin*smin;
        return (val1>val2)?val1:val2;

    }
}