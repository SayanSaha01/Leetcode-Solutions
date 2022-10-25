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
//when it encounters the alphabets for the first time, it assigns them the alphabets according to the order of the substitution table
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<message.length();j++)
        {
            char ch = message.charAt(j);
            if(map.containsKey(ch))
            {
                sb.append(map.get(ch));
            }
            else
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}