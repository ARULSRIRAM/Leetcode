class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int maxVow=0;
        int maxCon=0;
        String vowel="aeiou";
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Character ch:map.keySet()){
            if(vowel.contains(String.valueOf(ch))){
                maxVow=Math.max(maxVow,map.get(ch));
            }else{
                maxCon=Math.max(maxCon,map.get(ch));
            }
        }
        return maxVow+maxCon;
    }
}