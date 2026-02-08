class Solution {
    public int alternateDigitSum(int n) {
        int len=(int)Math.log10(n);
        int sum=0;
        int sign=1;
        if(len%2==0)sign=-1;
        while(n>0){
            int digit=n%10;
            sign*=-1;
            sum+=sign*digit;
            
            n/=10;
        }
        return sum;
    }
}