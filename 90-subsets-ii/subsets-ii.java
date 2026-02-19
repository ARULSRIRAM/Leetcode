class Solution {
        List<List<Integer>>res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0,new ArrayList<>(),nums);
        return res;
    }
    private void backtrack(int index,List<Integer> temp,int[] nums){
        
        res.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            backtrack(i+1,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}