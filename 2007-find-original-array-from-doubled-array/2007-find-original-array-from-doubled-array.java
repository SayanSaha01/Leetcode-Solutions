class Solution {
    public int[] findOriginalArray(int[] changed) {
        int[] temp = new int[changed.length/2];
        Queue<Integer> queue = new LinkedList<>();
        Arrays.sort(changed);
        int index=0;
        for(int num:changed)
        {
            if(!queue.isEmpty() && queue.peek()==num)
            {
                temp[index++]=queue.poll()/2;
            }
            else
            {
                queue.add(num*2);
            }
        }
        return queue.size()>0?new int[]{}:temp;
    }
}