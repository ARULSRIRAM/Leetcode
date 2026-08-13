class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long max=Long.MIN_VALUE;
        for(int i=0;i<time.length;i++){
            if(max<time[i])max=time[i];
        }
        long low=1;
        long high = max*totalTrips;
        long ans=0;
        while(low<=high){
            long mid=low +(high-low)/2;
            if(isItPossible(mid,time,totalTrips)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public static boolean isItPossible(long mid,int[] time,int totalTrips){
        long trips=0;
        for(int i=0;i<time.length;i++){
            trips+=mid/time[i];
        }
        return trips>=totalTrips;
    }
}