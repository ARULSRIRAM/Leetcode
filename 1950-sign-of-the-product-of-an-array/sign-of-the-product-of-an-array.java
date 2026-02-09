class Solution {
    public int arraySign(int[] nums) {
        int negative=0;
        for(int num:nums){
           
            if(num==0)return 0;
            if(num<0)negative++;
        }
        return signFunc(negative);
    }
    private int signFunc(int num){
        return num%2==0?1:-1;

    }
}