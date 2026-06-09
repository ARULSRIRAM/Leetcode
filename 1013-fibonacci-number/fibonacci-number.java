class Solution {
    public int fib(int n) {
        int[] arr=new int[n+1];
        Arrays.fill(arr,-1);
        return fibonacci(arr,n);
    }
    public int fibonacci(int dp[],int n){
        if(n==0 || n==1)return n;
        if(dp[n]!=-1)return dp[n];

        return dp[n]=fibonacci(dp,n-1)+fibonacci(dp,n-2);
    } 
}