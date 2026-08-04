class Solution {
    public int pivotIndex(int[] nums) {
        // int left=0;
        // int total=0;
        // for(int num:nums)total+=num;
        // for(int i=0;i<nums.length;i++){
        //     int right=total-left-nums[i];
        //     if(left==right)return i;
        //     left+=nums[i];
        // }
        // return -1;

        //using prefix array
        int n=nums.length;
        int prefix[]=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int total=prefix[n-1];
        for(int i=0;i<n;i++){
            int left_sum=(i==0)?0:prefix[i-1];
            int right_sum=total-prefix[i];
            if(left_sum == right_sum)return i;
        }
        return -1;
    }
}