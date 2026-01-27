class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums=new ArrayList<>();
        for(int i=1;i<=n;i++){
            nums.add(i);
        }
        return calculate(nums,k-1);
    }
    private String calculate(List<Integer> nums,int k){
        
        int n=nums.size();
        if(n==0)return "";
        int f=fact(n-1);
        int idx=k/f;
        int selected=nums.get(idx);
        nums.remove(idx);
        return selected+calculate(nums,k%f);
    }
    private int fact(int n){
        if(n==0 || n==1)return 1;
        return n*fact(n-1);
    }
}