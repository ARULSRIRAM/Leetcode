class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> map=new HashMap<>();
        int count=0;
        for(char ch:stones.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:jewels.toCharArray()){
            count+=map.getOrDefault(ch,0);
        }
        return count;
    }
}