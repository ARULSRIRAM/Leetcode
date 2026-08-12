class Solution {
    public String trimTrailingVowels(String s) {
        String vowel="aeiou";
        int count=s.length();
        for(int i=s.length()-1;i>=0;i--){
            if(vowel.contains(String.valueOf(s.charAt(i)))){
                count-=1;
            }
            else{
                break;
            }
        }
        return s.substring(0,count);
    }
}