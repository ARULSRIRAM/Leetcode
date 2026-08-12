class Solution {
    public int vowelConsonantScore(String s) {
        String vowels="aeiou";
        int v=0;
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(vowels.contains(String.valueOf(ch))){
                v++;
            }
            else if(ch>='a' && ch<='z'){
                c++;
            }
        }
        return c==0 ? 0: v/c;
    }
}