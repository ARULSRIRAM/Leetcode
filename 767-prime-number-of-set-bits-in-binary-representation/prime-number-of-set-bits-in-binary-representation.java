class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int temp=i;
            int setcount=0;
            while(temp>0){
                if((temp&1)!=0){
                    setcount++;
                }
                temp=temp>>1;
            }
            count+=isPrime(setcount);
        }
        return count;
        
    }
    private int isPrime(int n){
            if(n==2 || n==3 || n==5 || n==7 || n==11 || n==13 || n==17 || n==19)return 1;
            return 0; 

        }
        
}