class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int maxi=0;
        for(int i=0;i<=heights.length;i++){
            int h=i==heights.length? 0:heights[i];
            while(!st.isEmpty() && heights[st.peek()]>h){
                int height=heights[st.pop()];
                int right=i;
                int left=st.isEmpty()?-1:st.peek();
                int width=right-left-1;
                maxi=Math.max(maxi,width*height);
            }
            st.push(i);
        }
        return maxi;
    }
}