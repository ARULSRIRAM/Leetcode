class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     int max=Integer.MIN_VALUE;
     int n=piles.length;
     for(int i=0;i<n;i++){
        if(max<piles[i])max=piles[i];
     }
     int low=1;
     int high=max;
     int ans=Integer.MAX_VALUE;
     while(low<=high){
        int mid=low+(high-low)/2;
        if(canEatBananas(mid,piles,h)){
            ans=mid;
            high=mid-1;
        }
        else low=mid+1;
     }
     return ans;   
    }
    public static boolean canEatBananas(int speed,int[] piles,int H){
        int hr=0;
        for(int i=0;i<piles.length;i++){
            hr+=Math.ceil((double)piles[i]/speed);
        }
        return hr<=H ;
    }
}