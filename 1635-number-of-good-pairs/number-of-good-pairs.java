class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.values()){
            if(num>1){
                count+=(num*(num-1))/2;
            }
        }
        return count;
    }
}