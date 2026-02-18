class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(char num:tasks){
            map.put(num,map.getOrDefault(num,0)+1);
            max=Math.max(max,map.get(num));
        }
        int count=0;
        for(int num:map.values()){
            if(num==max)count++;
        }
        int ans=(max-1)*(n+1)+count;
        if(ans<tasks.length)return tasks.length;
        else return ans;
    }
}