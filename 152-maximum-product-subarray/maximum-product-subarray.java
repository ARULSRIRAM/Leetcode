class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int maxi=Integer.MIN_VALUE;
        int prefix=1;
        int suffix=1;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(prefix==0)prefix=1;
            if(suffix==0)suffix=1 ;
            prefix=nums[i]*prefix;
            suffix=nums[n-i-1]*suffix;
            
            maxi=Math.max(maxi,Math.max(prefix,suffix));
        }
        return maxi;
    }
}