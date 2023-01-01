class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<Character,String>();
        String[] str = s.split(" ");
        if(pattern.length()!=str.length)
            return false;
        for(int i=0;i<pattern.length();i++)
        {
            if(!map.containsKey(pattern.charAt(i)))  //if map doesnt contain the key but somehow contains the pattern of the key
            {
                if(map.containsValue(str[i]))
                    return false;
                map.put(pattern.charAt(i),str[i]);
            }
            else if(map.containsKey(pattern.charAt(i)))
            {
                if(!map.get(pattern.charAt(i)).equals(str[i]))
                    return false;
            }
        }
        return true;
    }
}