class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1;i< nums.length-1;i+=2){
            swap(nums,i,i+1);
        }
        return nums;
    }
    public void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}