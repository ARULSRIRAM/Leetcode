class Solution {
    public int countSegments(String s) {
        if(s.equals(""))return 0;
        int count=0;
        boolean letter=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ' && !letter){
                count++;
                letter=true;
            }
            else if(s.charAt(i)==' '){
                letter=false;
            }
        }
        return count;
    }
}