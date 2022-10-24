class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                list.add(i);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int[] answers = new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<list.size();j++)
            {
                pq.offer(Math.abs(i-list.get(j)));
            }
            answers[i]=pq.poll();
            pq.clear();
        }
        return answers;
    }
}