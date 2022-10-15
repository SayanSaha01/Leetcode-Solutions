/*
//Using Deque
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Deque<Integer> even = new LinkedList<>();
        Deque<Integer> odd = new LinkedList<>();
        for(int i:nums)
        {
            if(i%2==0)
            {
                even.offer(i);
            }
            else
            {
                odd.offer(i);
            }
        }
        int index=0;
        int[] res = new int[nums.length];
        while(!even.isEmpty())
        {
            res[index++]=even.removeFirst();
        }
        while(!odd.isEmpty())
        {
            res[index++]=odd.removeFirst();
        }
        return res;
    }
}
*/
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        for(int i:nums)
        {
            if(i%2==0)
            {
                arr[start++]=i;
            }
            else
            {
                arr[end--]=i;
            }
        }
        return arr;
    }
}