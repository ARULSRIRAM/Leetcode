class Solution {
    public int matrixSum(int[][] nums) {
        int row=nums.length;
        int col=nums[0].length;
        for(int i=0;i<row;i++){
            Arrays.sort(nums[i]);
        }
        int score=0;
        for(int j=col-1;j>=0;j--){
            int max=0;
            for(int i=0;i<row;i++){
                max=Math.max(max,nums[i][j]);
            }
            score+=max;
        }
        return score;
    }
}