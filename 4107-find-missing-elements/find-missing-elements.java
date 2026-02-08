class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        List<Integer> ans=new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(maxi,nums[i]);
            mini=Math.min(mini,nums[i]);
        }
        int size=maxi-mini+1;
        int value=mini;
        for(int i=0;i<size;i++){  
            // arr[0]=add++;
            ans.add(value++);
        }
        for(int num:nums){
            if(ans.contains(num))ans.remove(Integer.valueOf(num));
        }
        return ans;
    }
}