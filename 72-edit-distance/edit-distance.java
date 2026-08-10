class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int dp[][] =new int[m+1][n+1];
        for(int j=0;j<=n;j++){
            dp[0][j]=j;
        }
        for(int i=0;i<=m;i++){
            dp[i][0]=i;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    int insert=1+dp[i][j-1];
                    int delete=1+dp[i-1][j];
                    int replace=1+dp[i-1][j-1];
                    dp[i][j]=Math.min(insert,Math.min(delete,replace));
                }
            }
        }
        return dp[m][n];
    }
    // public static int editDistance(int i,int j,String s1,String s2){
    //     if(i<0)return j+1;
    //     if(j<0)return i+1;
    //     if(s1.charAt(i) == s2.charAt(j))return editDistance(i-1,j-1,s1,s2);
    //     else {
    //         int insert=1+editDistance(i,j-1,s1,s2);
    //         int delete=1+editDistance(i-1,j,s1,s2);
    //         int replace=1+editDistance(i-1,j-1,s1,s2);
    //         return Math.min(insert,Math.min(delete,replace));
    //     }
    // }
    
}