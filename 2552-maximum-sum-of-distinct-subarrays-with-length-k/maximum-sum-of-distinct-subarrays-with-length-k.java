class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l=0;
        long sum=0,max=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            set.add(nums[i]);
            sum+=nums[i];
            if(i-l+1>k){
                set.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            if(i-l+1==k)max=Math.max(max,sum);
        }
        return max;
    }
}