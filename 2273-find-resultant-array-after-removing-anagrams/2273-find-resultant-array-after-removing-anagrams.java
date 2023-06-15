class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i=1;i<words.length;i++)
        {
            if(!isAnagram(words[i-1],words[i]))
            {
                list.add(words[i]);
            }
        }
        return list;
    }
    public boolean isAnagram(String s, String t)
    {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String st = new String(arr);
        
        char[] brr = t.toCharArray();
        Arrays.sort(brr);
        String bt = new String(brr);
        
        return st.equals(bt);
    }
}