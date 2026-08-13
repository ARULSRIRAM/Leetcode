class Solution {
    public boolean isPerfectSquare(int num) {
        // int i=1;
        // while(num>0){
        //     num-=i;
        //     i+=2;
        // }
        // return num==0;
        // long i=1;
        // while(i*i<=num){
        //     if(i*i==num)return true;
        //     i++;
        // }
        // return false;
        if(num == 1)return true;
        long low=1;
        long high=num/2;
        while(low<=high){
            long mid=low+(high - low)/2;
            if(mid*mid == num){
                return true;
            }
            else if(mid*mid < num){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return false;
    }
}