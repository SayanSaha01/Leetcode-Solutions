class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] numscopy = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            numscopy[i] = nums[i];
            pq.offer(nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<k;i++)
        {
            list.add(pq.poll());
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