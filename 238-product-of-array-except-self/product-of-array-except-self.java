class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix[]=new int[nums.length];
        Arrays.fill(prefix,1);
        int pre=1;
        int post=1;
        for(int i=0;i<nums.length;i++){
            prefix[i]=pre;
            pre=pre*nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            prefix[i]=prefix[i]*post;
            post=post*nums[i];
        }
        return prefix;
    }
}