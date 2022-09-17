class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        PriorityQueue<Integer> player = new PriorityQueue<Integer>();
        PriorityQueue<Integer> trainer = new PriorityQueue<Integer>();
        for(int i:players)
            player.add(i);
        for(int j:trainers)
            trainer.add(j);
        int count=0;
        while(!player.isEmpty() && !trainer.isEmpty())
        {
            if(player.peek()<=trainer.peek())
            {
                count++;
                player.poll();
                trainer.poll();
            }
            else
            {
                trainer.poll();
            }
        }
        return count;
    }
}