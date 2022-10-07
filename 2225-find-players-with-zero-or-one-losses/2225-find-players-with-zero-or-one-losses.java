class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<Integer>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<matches.length;i++)
        {
            if(!map.containsKey(matches[i][1]))
            {
                map.put(matches[i][1],1);
            }
            else
            {
                map.put(matches[i][1],map.get(matches[i][1])+1);
            }
        }
        ArrayList<Integer> loser = new ArrayList<Integer>();
        for(int i:map.keySet())
        {
            if(map.get(i)==1)
            {
                loser.add(i);
            }
        }
        TreeSet<Integer> ans = new TreeSet<>();
		for (int i = 0; i < matches.length; i++) {
			if (!map.containsKey(matches[i][0])) {
				ans.add(matches[i][0]);
			}
		}
		List<Integer> winner = new ArrayList<>(ans);
        list.add(winner);
        list.add(loser);
        return list;
    }
}