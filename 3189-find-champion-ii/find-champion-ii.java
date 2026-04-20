class Solution {
    public int findChampion(int n, int[][] edges) {
        int arr[]=new int[n];
        for(int i=0;i<edges.length;i++){
            int loser=edges[i][1];
            arr[loser]++;
        }
        int champion=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                if(champion!=-1)return -1;
                champion=i;
            }
        }
        return champion;
    }
}