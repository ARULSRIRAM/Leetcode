class Solution {
    public int hIndex(int[] citations) {
        // Solution ->1
        // Arrays.sort(citations);
        // int n=citations.length;
        // for(int i=0;i<n;i++){
        //     int h=n-i;
        //     if(citations[i]>=h){
        //         return h;
        //     }
        // }
        // return 0;
        int n=citations.length;
        int[] count=new int[n+1];
        for(int c:citations){
            if(c>=n){
                count[n]++;
            }
            else
            {
                count[c]++;
            }
        }
        int total=0;
        for(int h=n;h>=0;h--){
            total+=count[h];
            if(total>=h){
                return h;
            }
        }
        return 0;
    }
}