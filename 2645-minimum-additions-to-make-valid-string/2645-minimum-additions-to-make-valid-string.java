class Solution {
    public int addMinimum(String word) {
        Queue<Character> queue = new LinkedList<>();
        for(char c:word.toCharArray())
        {
            queue.add(c);
        }
        int count=0;
        while(!queue.isEmpty())
        {
            if(!queue.isEmpty() && queue.peek()=='a')
            {
                queue.poll();
            }
            else
            {
                count++;
            }
            if(!queue.isEmpty() && queue.peek()=='b')
            {
                queue.poll();
            }
            else
            {
                count++;
            }
            if(!queue.isEmpty() && queue.peek()=='c')
            {
                queue.poll();
            }
            else
            {
                count++;
            }
        }
        return count;
    }
}