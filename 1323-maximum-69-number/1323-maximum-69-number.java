class Solution {
    public int maximum69Number (int num) {
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        String s = Integer.toString(num);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='9')
            {
                String p =s.substring(0,i)+'6'+s.substring(i+1);
                System.out.println(p);
                pq.offer(Integer.valueOf(p));
            }
            else if(s.charAt(i)=='6')
            {
                String p =s.substring(0,i)+'9'+s.substring(i+1);
                System.out.println(p);
                pq.offer(Integer.valueOf(p));
            }
        }
        return num>pq.peek()?num:pq.poll();
    }
}