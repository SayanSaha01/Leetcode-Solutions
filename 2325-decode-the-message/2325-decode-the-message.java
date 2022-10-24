class Solution {
    public String decodeMessage(String key, String message) {
        key = key.replaceAll(" ","");
        
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        int i=0;
        for(char c:key.toCharArray())
        {
            if(map.containsKey(c))
            {
                continue;
            }
            else
            {
                map.put(c,(char)(i+'a'));
                i++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(char c:message.toCharArray())
        {
            if(map.containsKey(c))
            {
                sb.append(map.get(c));
            }
            else
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}