class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        boolean sign=false;
        int num=0;
        for(int i=0;i<s.length();i++){
            if(i==0 && s.charAt(0)=='-'){
                sign=true;
                continue;
            }
            if(i==0 && s.charAt(0)=='+')continue;
            if(!Character.isDigit(s.charAt(i)))break;
            int digit=s.charAt(i)-'0';
            while(num>(Integer.MAX_VALUE - digit)/10){
                return sign?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            num=(num*10)+digit;  
        }
        
        return sign?-num:num;
    }
}