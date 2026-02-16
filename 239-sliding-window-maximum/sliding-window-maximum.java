class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q=new ArrayDeque<>();
        int n=nums.length;
        int ans[]=new int[n-k+1];
        int index=0;
        for(int i=0;i<n;i++){
            if(!q.isEmpty() && q.peekFirst()<=i-k){
                q.pollFirst();
            }
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                ans[index++]=nums[q.peekFirst()];
            }
        }
        return ans;
    }
}