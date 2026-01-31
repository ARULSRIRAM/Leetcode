class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int minlen=Math.min(a,b);
        for(int i=1;i<=minlen;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}