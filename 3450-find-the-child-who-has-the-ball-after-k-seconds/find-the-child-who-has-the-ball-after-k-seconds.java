class Solution {
    public int numberOfChild(int n, int k) {
        int full=k/(n-1);
        int extra=k%(n-1);
        if(full%2==0)return extra;
        return n-extra-1;
    }
}