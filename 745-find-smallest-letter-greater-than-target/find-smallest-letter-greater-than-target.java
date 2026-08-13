class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int high=letters.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low + (high-low)/2;
            if(letters[mid] > target){
                ans=Math.min(ans,mid);
                high=mid-1;
            } 
            else {
                low=mid+1;
            }
        }
        if(ans!=Integer.MAX_VALUE){
            return letters[ans];
        }
        return letters[0];
    }
}