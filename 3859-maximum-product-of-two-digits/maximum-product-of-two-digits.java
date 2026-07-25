class Solution {
    public int maxProduct(int n) {
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int count=(int)Math.log10(n)+1;
        for(int i=0;i<count;i++){
            int n1=n%10;
            if(n1>fmax)
            {
                smax=fmax;
                fmax=n1;

            }
            else if(n1<=fmax && smax<n1)
            {

                smax=n1;
            }
            n=n/10;
        }
        return fmax*smax;
    }
}