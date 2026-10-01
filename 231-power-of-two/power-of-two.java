class Solution {
    public boolean isPowerOfTwo(int n) {
        // for(int i=0;i<=n;i++){
        //     if(n==Math.pow(2,i)){
        //        return true;
        //     } 
        //     else if(n<Math.pow(2,i))break;
        // }
        // return false;
        if(n<=0)return false;
        if(n==1)return true;
        return (((n & (n-1))==0))?true: false;
    }
}