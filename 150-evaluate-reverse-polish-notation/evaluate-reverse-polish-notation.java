class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String num:tokens){
            if(isOperator(num)){
                int b=stack.pop();
                int a=stack.pop();
                int result=0;
                switch(num){
                    case "+" :
                        result=a+b;
                        break;
                    case "-":
                        result=a-b;
                        break;
                    case "*":
                        result=a*b;
                        break;
                    case "/":
                        result=a/b;
                        break;
                }
                stack.push(result);

            }
            else{
                stack.push(Integer.parseInt(num));
            }
           
        }  
        return stack.pop(); 
    }
    boolean isOperator(String s){
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}