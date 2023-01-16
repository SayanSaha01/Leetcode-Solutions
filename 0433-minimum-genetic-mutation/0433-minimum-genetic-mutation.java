class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {  boolean[] isVisited = new boolean[bank.length];
        Queue<String> q = new LinkedList<>();
        q.offer(startGene);
        int step = -1;
        while(!q.isEmpty()){
            int size = q.size();
            step++;
            for(int i =0; i<size; i++){
                String s = q.poll();
                if(s.equals(endGene)) return step;

                for(int j=0; j<bank.length; j++){
                    if(isVisited[j]) continue;
                    if(compare(s, bank[j]) == 1){
                        q.offer(bank[j]);
                        isVisited[j] = true;
                    }
                }
            }

        }
        return -1;
    }

    static int compare(String s, String p){
        int diff = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != p.charAt(i)) diff++;
        }
        return diff;
        
    }
}