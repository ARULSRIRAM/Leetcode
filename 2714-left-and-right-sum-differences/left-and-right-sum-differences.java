class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int prefix[]=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int total=prefix[n-1];
        for(int i=0;i<n;i++){
            int left=(i==0)?0:prefix[i-1];
            int right=(i==n-1)?0:total - prefix[i];
            ans[i]=Math.abs(left-right);
        }
        return ans;
    }
}