class MinStack {
    Stack<Integer> main;
    Stack<Integer> min;
    public MinStack() {
        min=new Stack<>();
        main=new Stack<>();
    }
    
    public void push(int val) {
        main.push(val);
        if(min.isEmpty()){
            min.push(val);
        }
        else if(min.peek()>=val){
            min.push(val);
        }
    }
    
    public void pop() {
        int peek=main.pop();
        if(peek==min.peek())min.pop();
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */