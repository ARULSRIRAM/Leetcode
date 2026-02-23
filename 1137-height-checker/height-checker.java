class Solution {
    public int heightChecker(int[] heights) {
        int count[]=new int[101];
        int index=0;
        for(int num:heights){
            count[num]++;
        }
        int c=0;
        for(int i=1;i<=100;i++){
            while(count[i]>0){
                if(heights[index]!=i){
                    c++;
                }
                index++;

                count[i]--;
            }
        }
        return c;
    }
}