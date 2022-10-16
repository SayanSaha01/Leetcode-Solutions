class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<Integer>();
        int second=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]<second)   //3rd
                return true;
            while(!st.isEmpty() && nums[i]>st.peek())   //2nd
                second = st.pop();
            st.push(nums[i]);    //1st
        }
        return false;
    }
}