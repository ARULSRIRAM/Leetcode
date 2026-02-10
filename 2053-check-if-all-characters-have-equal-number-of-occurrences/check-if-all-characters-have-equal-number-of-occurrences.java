class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int val=map.get(s.charAt(0));
        for(int num:map.values()){
            if(num!=val)return false;
        }
        return true;
    }
}