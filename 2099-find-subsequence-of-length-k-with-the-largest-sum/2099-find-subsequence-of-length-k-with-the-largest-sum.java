class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();  //minheap
        ArrayList<Integer> list = new ArrayList<Integer>();
     
        for(int i:nums)
        {
            pq.add(i);
            list.add(i);
        }
        
        for(int i=0;i<nums.length-k;i++)   //we only need k elements, so dropping the lowest elements,leaving the elements which render the max sum, the list mantains their natural order
        {
            list.remove(pq.poll());
        }
        int[] arr = new int[k];
        for(int i=0;i<k;i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}