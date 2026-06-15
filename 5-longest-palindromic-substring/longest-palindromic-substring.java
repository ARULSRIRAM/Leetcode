class Solution {
    public String longestPalindrome(String s) {
        int maxlength=Integer.MIN_VALUE;
        if(s.length()==1)return s;
        String sub_str="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(palindrome(sub)){
                    if(maxlength<sub.length()){
                        sub_str=sub;
                        maxlength=sub.length();
                    }
                }
            }
        }
        return (maxlength==Integer.MIN_VALUE)?s.substring(0,1):sub_str;
    }
    public boolean palindrome(String sub){
       int i=0;
       int j=sub.length()-1;
       while(i<=j){
        if(sub.charAt(i)!=sub.charAt(j)){
            return false;
        }
        i++;
        j--;
       }
       return true;
    }
}