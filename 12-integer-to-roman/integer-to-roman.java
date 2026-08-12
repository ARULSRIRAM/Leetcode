class Solution {
    public String intToRoman(int num) {
       StringBuilder sb=new StringBuilder();
       int[] arr1={1000,900,500,400,100,90,50,40,10,9,5,4,1};
       String[] arr2={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
       int i=0;
       int temp=num;
       while(temp>0 && i<arr1.length){
        if(temp>=arr1[i]){
            temp-=arr1[i];
            sb.append(arr2[i]);
        }
        else i++;
       }
       return sb.toString();
    }
}