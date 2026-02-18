class Solution {
    public boolean hasAlternatingBits(int n) {
        int ans=n ^ (n>>1);
        int count=0;
        int temp=n;
        while(temp>0){
            count++;
            temp>>=1;
        }
        int setBit=0;
        while(ans>0){
            if((ans&1)==1)setBit++;
            ans=ans>>1;

        }
        if(count==setBit)return true;
        return false;
    }
}