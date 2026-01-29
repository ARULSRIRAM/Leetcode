class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int ans[]=new int[heights.length];
        Stack<Integer> stack=new Stack<>();
        int n=heights.length;
        
        for(int i=n-1;i>=0;i--){
            int count=0;
            while(!stack.isEmpty() && heights[i]>stack.peek()){
                count++;
                stack.pop();
            }
            if(!stack.isEmpty()){
                count++;
            }
            stack.push(heights[i]);
            ans[i]=count;
        }
        return ans;
    }
}