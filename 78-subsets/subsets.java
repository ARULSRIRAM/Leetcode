class Solution {
    private static List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        // Using Bit manuplation
        // List<List<Integer>> ans=new ArrayList<>();
        // int len=1<<nums.length;
        // for(int i=0;i<len;i++){
        //     List<Integer> res=new ArrayList<>();
        //     for(int j=0;j<nums.length;j++){
        //         if((i &1<<j)!=0){
        //             res.add(nums[j]);
        //         }
        //     }
        //     ans.add(res);
        // }
        // return ans;
        res=new ArrayList<>();
        backtrack(0,new ArrayList<>(),nums);
        return res;
    }
    private void backtrack(int index,List<Integer> temp,int[] nums){
        res.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(i+1,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}