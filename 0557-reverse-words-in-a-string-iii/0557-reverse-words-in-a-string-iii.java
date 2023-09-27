class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            StringBuilder rev = new StringBuilder(arr[i]);
            rev.reverse();
            sb.append(rev+" ");
        }
        return sb.toString().trim();
    }
}