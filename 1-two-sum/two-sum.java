class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return null;
        }
        // int i=0,j=i+1,k=0;
        // while(i<nums.length){
        //     if(nums[i]+nums[j]==target){
        //         return new int[]{i,j};
        //     }
        //     i++;
        //     j++;
        // }
        // return new int[]{};
}