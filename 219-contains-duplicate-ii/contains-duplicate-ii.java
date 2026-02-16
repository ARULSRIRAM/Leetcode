class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left=0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i-left>k){
                set.remove(nums[left]);
                left++;
            }
            if(!set.add(nums[i]))return true;
        }
        return false;
    }
}