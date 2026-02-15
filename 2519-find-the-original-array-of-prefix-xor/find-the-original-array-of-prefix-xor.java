class Solution {
    public int[] findArray(int[] pref) {
        //solution 1
        // if(pref.length==1)return pref;
        // int n=pref.length;
        // int[] arr=new int[n];
        // arr[0]=pref[0];
        // for(int i=1;i<n;i++){
        //     arr[i]=pref[i]^pref[i-1];
        // }
        // return arr;
        

        //solution 2
        int n=pref.length;
        for(int i=n-1;i>0;i--){
            pref[i]^=pref[i-1];
        }
        return pref;
    }
}