class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')' && st.size()!=0){
                st.pop();
            }
            else{
                ans++;
            }
        }
        return ans+st.size();
    }
}