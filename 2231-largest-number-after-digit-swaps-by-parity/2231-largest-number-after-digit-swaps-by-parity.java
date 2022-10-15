class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> even = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> odd = new PriorityQueue<Integer>(Collections.reverseOrder());
        int numcopy = num;
        while(num>0)
        {
            int n=num%10;
            if(n%2==0)
                even.add(n);
            else
                odd.add(n);
            num=num/10;
        }
        String s = String.valueOf(numcopy);
        String res = "";
        int idx = 0;
        while(idx<s.length())
        {
            if(s.charAt(idx)%2==0)
                res+=even.poll();
            else
                res+=odd.poll();
            idx++;
        }
        return Integer.parseInt(res);
    }
}