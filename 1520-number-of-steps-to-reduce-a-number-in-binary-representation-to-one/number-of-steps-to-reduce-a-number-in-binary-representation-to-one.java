class Solution {
    public int numSteps(String s) {
        int n=s.length()-1;
        int count=0;
        int carry=0;
        for(int i=n;i>0;i--){
            int current=(s.charAt(i)-'0')+carry;
            if(current==1){
                count+=2;
                carry=1;
            }
            else{
                count+=1;
            }
        }
        return count+carry;
    }
}