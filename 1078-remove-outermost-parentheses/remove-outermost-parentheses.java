class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Integer> st=new Stack();
        int idx=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')st.push(i);
            else if(ch==')' && !st.isEmpty())idx=st.pop();

            if(st.isEmpty())sb.append(s.substring(idx+1,i));
        }
        return sb.toString();
    }
}