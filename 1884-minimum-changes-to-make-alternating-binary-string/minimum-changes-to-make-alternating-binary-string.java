class Solution {
    public int minOperations(String s) {
        int  odd=0,even=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=(i%2==0?'0':'1'))even++;
            if(s.charAt(i)!=(i%2==0?'1':'0'))odd++;
        }
        return Math.min(odd,even);
    }
}