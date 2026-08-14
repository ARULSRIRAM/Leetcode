class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        int depth=0;
        int maxDepth=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch == '('){
                st.push(ch);
                depth++;
                maxDepth=Math.max(maxDepth,depth);
            }
            else if(ch == ')'){
                st.pop();
                depth--;
            }
        }
        return maxDepth;
    }
}