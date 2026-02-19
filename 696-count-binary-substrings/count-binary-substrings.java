class Solution {
    public int countBinarySubstrings(String s) {
        int curr=1;
        int sum=0;
        int pre=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                curr++;
            }
            else{
                sum+=Math.min(pre,curr);
                pre=curr;
                curr=1;
            }
        }
        sum+=Math.min(pre,curr);
        return sum;
    }
}