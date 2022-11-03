/*
Sort A
For every element b in B from big to small,
if A[-1] > b,
then this b will take the biggest element in A by A.pop().
otherwise take the smallest in A by A.popleft()
*/
class Pair{
    int index,ele;
    Pair(int a,int b)
    {
        this.index = a;
        this.ele = b;
    }
}
class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a1,b1)->b1.ele-a1.ele);
        for(int i=0;i<nums2.length;i++)
        {
            pq.offer(new Pair(i,nums2[i]));
        }
        int[] res = new int[nums1.length];
        Arrays.sort(nums1);
        int low = 0;
        int end = nums1.length-1;
        while(!pq.isEmpty())
        {
            if(pq.peek().ele < nums1[end])
            {
                res[pq.poll().index]=nums1[end];
                end--;
            }
            else  //if the biggest number in pq from array nums2 cant be replaced with the largest number from nums1 we replace it with the most minimum to maximize our advantage wrt nums2
            {
                res[pq.poll().index]=nums1[low];
                low++;
            }
        }
        return res;
    }
}