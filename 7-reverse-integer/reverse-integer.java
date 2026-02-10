class Solution {
    public int reverse(int x) {
        int num = Math.abs(x); 
        
        int sum=0;
        while(num>0){
            int digit=num%10;
            num/=10;
            if(sum>Integer.MAX_VALUE/10 || sum<Integer.MIN_VALUE/10)return 0;
            sum=(sum*10)+digit;
        }
        return x<0?-sum:sum;
    }
}