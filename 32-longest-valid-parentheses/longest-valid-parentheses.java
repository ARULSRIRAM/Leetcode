class Solution {
    public int longestValidParentheses(String s) {
        if(s.length()==0)return 0;
        Stack<Integer> stack=new Stack<>();
        int maxlen=0;
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')') {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    maxlen=Math.max(maxlen,i-stack.peek());
                }
            }
            else if(ch=='('){
                stack.push(i);
            }
        }
        return maxlen;

    }
}