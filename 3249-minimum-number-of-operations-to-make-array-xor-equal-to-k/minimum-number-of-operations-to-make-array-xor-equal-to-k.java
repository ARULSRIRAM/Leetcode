class Solution {
    public int minOperations(int[] nums, int k) {
        int flips=0;
        for(int i=0;i<32;i++){
            int mask=(1<<i);
            int val=0;
            for(int j=0;j<nums.length;j++){
                val^=nums[j];
            }
            if((val & mask) != (k & mask))flips++;
        }
        return flips;
    }
}