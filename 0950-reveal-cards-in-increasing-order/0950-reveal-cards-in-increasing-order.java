class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<deck.length;i++)
        {
            queue.add(i);
        }
        int[] res = new int[deck.length];
        Arrays.sort(deck);
        for(int i=0;i<deck.length;i++)
        {
            res[queue.poll()]=deck[i];
            queue.add(queue.poll());
        }
        return res;
    }
}