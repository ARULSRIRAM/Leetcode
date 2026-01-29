class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int left=0;
        int count=0;
        int maxlen=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
                count--;
            }
            set.add(ch);
            count++;
            maxlen=Math.max(maxlen,count);
        }
        return maxlen;
    }
}