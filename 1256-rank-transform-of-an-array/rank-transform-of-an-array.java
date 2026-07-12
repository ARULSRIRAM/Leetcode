class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=arr[i];
        }
        Arrays.sort(ans);
        int rank=1;
        for(int i=0;i<n;i++){
            if(!map.containsKey(ans[i])){
                map.put(ans[i],rank);
                rank++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}