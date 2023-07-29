class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.print(str);
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
        {
            sb.append(arr[i]);
        }
        String rev = sb.toString();
        return rev.equals(str);
    }
}