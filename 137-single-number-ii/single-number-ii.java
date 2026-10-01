class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<32;i++){
            int one=0;
            // int zero=0;
            int mask=1<<i;
            for(int j=0;j<nums.length;j++){
                if((nums[j] & mask)!=0)one++;
                // else zero++;
            }
            if(one%3 !=0)ans=ans | (1<<i);
        }
        return ans;
    }
}