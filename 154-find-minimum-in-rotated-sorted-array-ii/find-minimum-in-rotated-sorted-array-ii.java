class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low + (high-low)/2;
            if(nums[low]<=nums[mid]){
                //left half
                ans=Math.min(ans,nums[low]);
                low=low+1;
            }
            else{
                //right half
                ans=Math.min(ans,nums[mid]);
                high=high-1;
            }
        }
        return ans;
    }
}