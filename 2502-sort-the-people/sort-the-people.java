class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] arr=new String[heights.length];
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i=0;i<names.length;i++){
            arr[i]=map.get(heights[heights.length-1-i]);
        }
        return arr;
    }
}