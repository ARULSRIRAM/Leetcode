class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || x==10)return false;
        int sum=0;
        int temp=x;
        while(x>0){
            int digit=x%10;
            sum=(sum*10)+digit;
            x/=10;
        }
        return sum==temp;
    }
}