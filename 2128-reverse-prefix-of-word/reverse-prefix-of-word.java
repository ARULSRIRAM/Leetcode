class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int idx=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                sb.append(word.charAt(i));
                idx=i;
                break;
            }
            sb.append(word.charAt(i));
        }
        if(idx==-1)return word;
        return sb.reverse().toString()+word.substring(idx+1,word.length());
    }
}