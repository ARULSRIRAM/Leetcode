class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int[][] dp=new int[m][n];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
        return (m+n)-2*LCS(word1,word2,m-1,n-1,dp);
    }
    public static int LCS(String word1,String word2,int i,int j,int[][] dp){
        if(i < 0 || j < 0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(word1.charAt(i) == word2.charAt(j)) return dp[i][j]=1+LCS(word1,word2,i-1,j-1,dp);
        else{
            int l=LCS(word1,word2,i-1,j,dp);
            int r=LCS(word1,word2,i,j-1,dp);
            return dp[i][j]=Math.max(l,r);
        }
    }
}