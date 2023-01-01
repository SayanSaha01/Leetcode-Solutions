// https://leetcode.com/problems/next-greater-element-i/discuss/991295/Java-%3A-O(N)-Time-%2B-O(N)-Space-using-Monotonic-Stack-with-explanation
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<Integer>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int num:nums2)
        {
            while(!st.isEmpty() && st.peek()<num)
                map.put(st.pop(),num);
            st.push(num);
        }
        int index=0;
        int[] result = new int[nums1.length];
        for(int num:nums1)
        {
            result[index++] = map.getOrDefault(num,-1);
        }
        return result;
    }
}