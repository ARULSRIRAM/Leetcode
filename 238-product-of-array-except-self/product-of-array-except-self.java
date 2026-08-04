class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int prefix[]=new int[nums.length];
        // Arrays.fill(prefix,1);
        // int pre=1;
        // int post=1;
        // for(int i=0;i<nums.length;i++){
        //     prefix[i]=pre;
        //     pre=pre*nums[i];
        // }
        // for(int i=nums.length-1;i>=0;i--){
        //     prefix[i]=prefix[i]*post;
        //     post=post*nums[i];
        // }
        // return prefix;


        //Prefix 
        int n=nums.length;
        int prefix[]=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i];
        }
        int prod=1;
        for(int i=n-1;i>=0;i--){
            int left=(i==0)?1:prefix[i-1];
            int right=prod;
            prefix[i]=left*right;
            prod=prod*nums[i];
        }
        return prefix;
    }
}