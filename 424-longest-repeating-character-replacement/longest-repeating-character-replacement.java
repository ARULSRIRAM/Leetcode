class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int maxfre=0;
        int max=0;
        int l=0;
        for(int r=0;r<s.length();r++){
            freq[s.charAt(r)-'A']++;
            maxfre=Math.max(maxfre,freq[s.charAt(r)-'A']);
            while((r-l+1)-maxfre>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}