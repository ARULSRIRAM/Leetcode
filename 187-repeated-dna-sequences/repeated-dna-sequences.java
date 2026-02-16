class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list=new ArrayList<>();
        Set<String> set=new HashSet<>();
        if(s.length()<10)return list;
        set.add(s.substring(0,10));
        // int left=0;
        int k=10;
        for(int i=10;i<s.length();i++){
            if(!set.contains(s.substring(i-k+1,i+1))){
                set.add(s.substring(i-k+1,i+1));
            }
            else{
                if(!list.contains(s.substring(i-k+1,i+1)))list.add(s.substring(i-k+1,i+1));
            }
        }
        return list;
    }
}