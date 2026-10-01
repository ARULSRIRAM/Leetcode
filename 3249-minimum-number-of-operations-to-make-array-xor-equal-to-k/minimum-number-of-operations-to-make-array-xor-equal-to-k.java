class Solution {
    public int minOperations(int[] nums, int k) {
        // Solution -1 
        // Xor it with all elements and again xor with k then count the 
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        int diff=xor^k;
        return Integer.bitCount(diff);


        //Solution - 2
        // int flips=0;
        // for(int i=0;i<32;i++){
        //     int mask=(1<<i);
        //     int val=0;
        //     for(int j=0;j<nums.length;j++){
        //         val^=nums[j];
        //     }
        //     if((val & mask) != (k & mask))flips++;
        // }
        // return flips;
    }
}