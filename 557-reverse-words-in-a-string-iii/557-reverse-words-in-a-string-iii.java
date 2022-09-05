class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        s = "";
        for(int i=0;i<arr.length;i++){
            StringBuilder input1 = new StringBuilder(arr[i]);
            input1.reverse();
            if(i+1 == arr.length){
                s+= input1.toString();
            }
            else{
                s += input1.toString() + " ";
            }
        }
        return s;
    }
}