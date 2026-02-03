class Solution {
    public int hammingDistance(int x, int y) {
        int xor=x^y;
        return countBits(xor);
    }
    int countBits(int xor){
        int count=0;
        while(xor>0){
            xor=xor&(xor-1);
            count++;
        }
        return count;
    }
}