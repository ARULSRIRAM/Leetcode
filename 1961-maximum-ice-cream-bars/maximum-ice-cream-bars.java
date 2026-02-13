class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=Arrays.stream(costs).max().getAsInt();
        int count[]=new int[max+1];
        for(int num:costs){
            count[num]++;
        }
        int index=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                costs[index++]=i;
                count[i]--;
            }
        }
        int value=0;
        for(int num:costs){
            if(num<=coins){
                value++;
                coins-=num;
            }
        }
        return value;
    }
}