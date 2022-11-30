class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        int index=0;
        for(int i:arr)
        {
            arr[index++]=num%10;
            num=num/10;
        }
        Arrays.sort(arr);
        int num1 = arr[0]*10 + arr[2];
        int num2 = arr[1]*10 + arr[3];
        return num1+num2;

    }
}