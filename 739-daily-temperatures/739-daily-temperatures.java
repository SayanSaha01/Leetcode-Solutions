class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int[] res = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++)
        {
            if(s.isEmpty())
                s.push(i);
            while(s.isEmpty()==false && temperatures[s.peek()]<temperatures[i])
            {
                int idx = s.peek();
                res[idx] = i-s.pop();
            }
            s.push(i);
        }
        return res;
    }
}