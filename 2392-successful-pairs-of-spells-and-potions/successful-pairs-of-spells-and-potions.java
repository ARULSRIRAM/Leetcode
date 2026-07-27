class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length;
        int m=potions.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int low=0;
            int high=m-1;
            int first=m;
            while(low<=high){
                int mid=low+(high-low)/2;
                if((long)potions[mid]*spells[i] >=success){
                    first=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            ans[i]=m-first;
        }
        return ans;

    }
}