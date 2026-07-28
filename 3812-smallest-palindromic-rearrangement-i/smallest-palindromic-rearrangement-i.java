class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        if(s.length()==1)return s;
        String s1="";
        int[] freq=new int[26];
        for(int i=0;i<s.length()/2;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<freq[i];j++){
                sb.append((char)('a'+ i));
            }
        }

        s1=sb.toString();
        String s2=new StringBuilder(s1).reverse().toString();
        if(s.length()%2==1){
            sb.append(s.charAt(s.length()/2));
        }
        sb.append(s2);
        return sb.toString();
    }
}