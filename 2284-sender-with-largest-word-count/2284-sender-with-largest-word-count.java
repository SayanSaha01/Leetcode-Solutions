class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        int max=0;
        String name="";
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<messages.length;i++)
        {
            String[] words = messages[i].split(" ");
            int freq = map.getOrDefault(senders[i],0)+words.length;
            
            map.put(senders[i],freq);
                
            if(map.get(senders[i])>max)
            {
                max = map.get(senders[i]);
                name = senders[i];
            }
            //If there is more than one sender with the largest word count, return the one with the lexicographically largest name, hence we are using the compareTo operator
            else if(map.get(senders[i])==max && name.compareTo(senders[i])<0)
            {
                name = senders[i];
            }
        }
        return name;
    }
}