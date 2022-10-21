class Solution {
    public String arrangeWords(String text) {
        String[] alpha = text.split(" ");
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>
        ((a,b)->alpha[a].length()==alpha[b].length()?a-b:alpha[a].length()-alpha[b].length());
         //these two are numbersbasically as in pq.offer we are passing indexes
        
        for(int index=0; index<alpha.length; index++)
        {
            pq.offer(index);
        }
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(!pq.isEmpty())
        {
            int index = pq.poll();
            if(i==0)
            { sb.append(alpha[index].substring(0,1).toUpperCase()+alpha[index].substring(1).toLowerCase()+" ");
            }
            else{
                sb.append(alpha[index].toLowerCase()+" ");
            }
            i++;
        }
        return sb.toString().trim();
    }
}