class Solution {
    public int minFlips(int a, int b, int c) {
        int flip=0;
        for(int i=0;i<32;i++){
            int mask=(1<<i);
            if((c & mask)!=0){
                if((mask & a)==0  && (mask & b)==0)flip++;
            }
            else{
                if((mask & a) != 0)flip++;
                if((mask & b) != 0)flip++;
            }
        }
        return flip;
    }
}