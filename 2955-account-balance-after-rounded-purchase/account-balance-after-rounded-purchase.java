class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int ans=100;
        int last=purchaseAmount%10;
        if(last<5){
            last=(purchaseAmount/10)*10;
        }
        else{
            last=((purchaseAmount/10)+1)*10;
        }
        return ans-last;
    }
}