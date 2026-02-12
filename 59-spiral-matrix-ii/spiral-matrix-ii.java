class Solution {
    public int[][] generateMatrix(int n) {
        int lc=0,rc=n-1;
        int top=0,bot=n-1;
        int[][] arr=new int[n][n];
        int val=1;
        if(n==1){
            arr[0][0]=1;
            return arr;
        }
        while(val<=n*n){
            for(int i=lc;i<=rc && val<=n*n;i++){
                arr[top][i]=val++;
            }
            for(int i=top+1;i<bot && val<=n*n;i++){
                arr[i][rc]=val++;
            }
            for(int i=rc;i>=lc && val<=n*n;i--){
                arr[bot][i]=val++;
            }
            for(int i=bot-1;i>=top+1 && val<=n*n;i--){
                arr[i][lc]=val++;
            }
            lc++;
            rc--;
            top++;
            bot--;
        }
        return arr;

    }
}