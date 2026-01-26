class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<=n;i++){
            if(n==Math.pow(2,i)){
                return true;
            }
            else if(n<Math.pow(2,i))break;
        }
        return false;
    }
}