class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] numscopy = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            numscopy[i] = nums[i];
            pq.offer(nums[i]);
        }
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            count++;
            list.add(nums[i]);
            if(count==k)
                break;
        }
        int arr[] = new int[k];
        int index=0;
        for(int i=0;i<numscopy.length;i++)
        {
            if(list.contains(numscopy[i]))
            {
                arr[index]=numscopy[i];
                index++;
                list.remove(list.indexOf(numscopy[i]));
            }
        }
        return arr;
    }
}