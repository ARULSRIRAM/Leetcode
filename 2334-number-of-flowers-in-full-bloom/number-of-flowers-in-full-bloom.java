class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {

        //Brute Force
        // int n=people.length;
        // int[] ans=new int[n];
        // for(int p=0;p<n;p++){
        //     for(int i=0;i<flowers.length;i++){
        //         int start=flowers[i][0];
        //         int end=flowers[i][1];
        //         if(people[p]>= start && people[p]<=end){
        //             ans[p]++;
        //         }
        //     }
        // }
        // return ans;

        int n=people.length;
        int[] ans=new int[n];
        
        int[] startTime=new int[flowers.length];
        int[] endTime=new int[flowers.length];
        for(int i=0;i<flowers.length;i++){
            startTime[i]=flowers[i][0];
            endTime[i]=flowers[i][1];
        }
        Arrays.sort(startTime);
        Arrays.sort(endTime);
        for(int i=0;i<n;i++){
            int x=findFirstGreaterTarget(startTime,people[i]);
            int y=findFirstGreaterThanTarget(endTime,people[i]);
            ans[i]=x-y;
        }
        return ans;
    }
    public static int findFirstGreaterTarget(int[] startTime,int val){
        int low=0;
        int high=startTime.length-1;
        int ans=startTime.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(startTime[mid]>val){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
     public static int findFirstGreaterThanTarget(int[] endTime,int val){
        int low=0;
        int high=endTime.length-1;
        int ans=endTime.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(endTime[mid]>=val){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}