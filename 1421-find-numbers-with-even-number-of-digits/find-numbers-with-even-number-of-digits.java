class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(isEvenDigit(nums[i])){
                count++;
            }
        }
        return count;
    }
    private boolean isEvenDigit(int n){
        int digits = (int) (Math.log10(n) + 1);
        if(digits%2==0){
            return true;
        }
        return false;
    }
}