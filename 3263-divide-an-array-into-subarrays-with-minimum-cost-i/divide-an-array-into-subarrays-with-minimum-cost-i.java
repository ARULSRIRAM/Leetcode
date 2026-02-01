class Solution {
    public int minimumCost(int[] nums) {
        int first=nums[0];
        int second=Integer.MAX_VALUE;
        int result=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(i>=2){
                result=Math.min(result,first+second+nums[i]);
            }
            second=Math.min(second,nums[i]);
        }
        return result;
    }
}