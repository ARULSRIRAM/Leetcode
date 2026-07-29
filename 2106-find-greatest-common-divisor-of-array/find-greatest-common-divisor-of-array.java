class Solution {
    public int findGCD(int[] nums) {
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<mini){
                mini=nums[i];
            }
            if(nums[i]>maxi){
                maxi=nums[i];
            }
        }
        return gcd(mini,maxi);
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}