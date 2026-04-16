class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> win=new ArrayList<>();
        List<Integer> onelost=new ArrayList<>();
        for(int i=0;i<matches.length;i++){
            int winner=matches[i][0];
            int loser=matches[i][1];
            map.putIfAbsent(winner,0);
            map.put(loser,map.getOrDefault(loser,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==0)win.add(entry.getKey());
            if(entry.getValue()==1)onelost.add(entry.getKey());
        }
        Collections.sort(win);
        Collections.sort(onelost);
        res.add(win);
        res.add(onelost);
        return res;
    }
}