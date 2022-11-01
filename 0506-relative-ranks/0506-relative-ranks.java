class Solution {
    public String[] findRelativeRanks(int[] score) {
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++)
        {
            map.put(score[i],i);
        }
        int count=1;
        int index=0;
        String[] arr = new String[score.length];
        for(Map.Entry<Integer,Integer> key: map.entrySet())
        {
            if(count==1)
            {
                arr[key.getValue()]="Gold Medal";
            }
            else if(count==2)
            {
                arr[key.getValue()]="Silver Medal";
            }
            else if(count==3)
            {
                arr[key.getValue()]="Bronze Medal";
            }
            else
            {
                arr[key.getValue()]=Integer.toString(count);
            }
            count++;
        }
        return arr;
    }
}