class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        List<Integer> ans=new ArrayList<>();
        List<Integer> list2=Arrays.stream(nums).boxed().collect(Collectors.toList());
        Arrays.sort(nums);
        for(int i=nums[0];i<=nums[nums.length-1];i++){
            if(!list2.contains(i)) ans.add(i);
        }
        return ans;

    }
}