class Solution {
    public int calculate(String s) {
        Stack<Integer> stack=new Stack<>();
        int num=0;
        char prev='+';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10 + (ch-'0');
            }
            if(!Character.isDigit(ch) && ch!=' '|| i==s.length()-1){
                if(prev=='+'){
                    stack.push(num);
                }
                else if(prev=='-'){
                    stack.push(-num);
                }
                else if(prev=='*'){
                    stack.push(stack.pop()*num);
                }
                else if(prev=='/'){
                    stack.push(stack.pop()/num);
                }
                prev=ch;
                num=0;
            }
        }
        int result=0;
        for(int nums:stack){
            result+=nums;
        }
        return result;
    }
}