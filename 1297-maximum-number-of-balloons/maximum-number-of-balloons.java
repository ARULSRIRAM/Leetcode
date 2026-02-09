class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:text.toCharArray()){
            if(ch=='b' || ch=='a' || ch=='l' || ch=='o' || ch=='n'){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        int  b=map.getOrDefault('b',0);
        int  a=map.getOrDefault('a',0);
        int  l=map.getOrDefault('l',0)/2;
        int  o=map.getOrDefault('o',0)/2;
        int  n=map.getOrDefault('n',0);
        int mini=Integer.MAX_VALUE;
        mini=Math.min(mini,b);
        mini=Math.min(mini,a);
        mini=Math.min(mini,l);
        mini=Math.min(mini,o);
        mini=Math.min(mini,n);
        return mini;
    }
}