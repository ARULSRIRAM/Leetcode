class Solution {
    public String removeOuterParentheses(String s) {

        //Using Stack

        // StringBuilder sb=new StringBuilder();
        // int idx=0;
        // String str="";
        // Stack<Integer> st=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch == '(') st.push(i);
        //     else if(ch == ')' && !st.isEmpty()) idx=st.pop();
        //     if(st.isEmpty())sb.append(s.substring(idx+1,i));
        // }
        // return sb.toString();


        int n=s.length();
        int depth=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch == '('){
                depth++;
                if(depth>1){
                   sb.append("(");
                }
            }
            else {
                if(depth>1){
                    sb.append(")");
                }
                depth--;
            }
        }
        return sb.toString();
    }
}