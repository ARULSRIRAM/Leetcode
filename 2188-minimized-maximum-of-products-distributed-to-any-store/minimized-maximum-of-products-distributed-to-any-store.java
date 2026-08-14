class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
     int max=-1;
     int len=quantities.length;
     for(int i=0;i<len;i++){
        if(max<quantities[i])max=quantities[i];
     }   
     int low=1;
     int high=max;
     int ans=-1;
     while(low<=high){
        int mid=low+(high-low)/2;
        if(isItPossible(mid,quantities,n)){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
     }
     return ans;
    }
    public static boolean isItPossible(int mid,int[] quantities,int N){
        int storeNeeded=0;
        for(int i=0;i<quantities.length;i++){
            storeNeeded+=Math.ceil((double)quantities[i]/mid);
        }
        return storeNeeded<=N;
    }
}