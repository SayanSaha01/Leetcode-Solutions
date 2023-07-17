class Solution {
    public int fillCups(int[] amount) {
        int count=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:amount)
        {
            pq.add(i);
        }
        int c=0;
        int first_element=0;
        int second_element=0;
        while(!pq.isEmpty())
        {
            first_element = pq.poll();
            second_element = pq.poll();
            if(second_element!=0)
            {
                pq.add(first_element-1);
                pq.add(second_element-1);
                c++;
            }
            else
            {
                return c+first_element;
            }
        }
        return c;
    }
}