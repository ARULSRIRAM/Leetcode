class Solution {
    public int longestMountain(int[] arr) {
        int up=0,down=0;
        int maxlen=0;
        for(int i=1;i<arr.length;i++){
            if((down> 0 && arr[i-1]<arr[i]) || arr[i]==arr[i-1]){
                up=0;
                down=0;
            }
            if(arr[i]>arr[i-1])up++;
            else if(arr[i-1]>arr[i])down++;
            if(down>0 && up>0){
                maxlen=Math.max(maxlen,up+down+1);
            }
        }
        return maxlen;
    }
}