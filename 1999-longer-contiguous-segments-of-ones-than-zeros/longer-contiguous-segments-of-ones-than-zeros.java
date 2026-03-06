class Solution {
    public boolean checkZeroOnes(String s) {
        int maxone=0;
        int maxzero=0;
        int one=0;
        int zero=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                one++;
                zero=0;
            }
            else {
                zero++;
                one=0;
            }
            maxone=Math.max(one,maxone);
            maxzero=Math.max(zero,maxzero);
        }
        return maxone>maxzero;
    }
}