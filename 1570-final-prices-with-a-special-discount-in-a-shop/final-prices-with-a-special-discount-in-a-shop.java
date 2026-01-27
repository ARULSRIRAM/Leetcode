class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            while(!stack.isEmpty() && prices[i]<=prices[stack.peek()]){
                int peek=stack.pop();
                ans[peek]=prices[peek]-prices[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int peek=stack.pop();
            ans[peek]=prices[peek];
        }
        return ans;
    }
}