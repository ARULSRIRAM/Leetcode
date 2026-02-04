class Solution {
    public int singleNumber(int[] nums) {
        int one=0;
        int two=0;
        for(int i=0;i<nums.length;i++){
            one=(nums[i]^one)&~two;
            two=(nums[i]^two)&~one;
        }
        return one;
    }
}