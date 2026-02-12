class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(int num:map.values()){
            max=Math.max(max,num);
        }
        int count=0;
        for(int num:map.values()){
            if(max==num)count+=num;
        }
        return count;
    }
}