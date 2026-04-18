class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result=new ArrayList<>();
        int minValue=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            minValue=Math.min(minValue,arr[i+1]-arr[i]);
        }
        for(int i=0;i<arr.length-1;i++){
            if(minValue == arr[i+1]-arr[i]){
                result.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return result;
    }
}