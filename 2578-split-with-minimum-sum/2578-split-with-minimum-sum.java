class Solution {
    public int splitNum(int num) {
        String number = num+"";
        char[] arr = number.toCharArray();
        Arrays.sort(arr);
        String x1="";
        for(int i=0;i<arr.length;i+=2)
            x1+=arr[i];
        String x2="";
        for(int j=1;j<arr.length;j+=2)
            x2+=arr[j];
        return Integer.parseInt(x1)+Integer.parseInt(x2);
    }
}