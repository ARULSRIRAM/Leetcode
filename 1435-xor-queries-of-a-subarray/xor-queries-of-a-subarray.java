class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int xor[]=new int[n];
        int ans[]=new int[queries.length];
        xor[0]=arr[0];
        for(int i=1;i<n;i++){
            xor[i]=xor[i-1]^arr[i];
        }
        for(int i=0;i<queries.length;i++){
            int left=queries[i][0];
            int right=queries[i][1];
            if(left == 0) ans[i]=xor[right];
            else ans[i]=xor[right]^xor[left-1];
        }
        return ans;
        
    }
}