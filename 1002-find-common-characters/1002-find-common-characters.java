class Solution {
    public List<String> commonChars(String[] words) {
        int[] array = new int[26];
        Arrays.fill(array,Integer.MAX_VALUE);
        for(String str:words)
        {
            int[] res = new int[26];
            for(char ch:str.toCharArray())
            {
                res[ch-'a']++;
            }
            for(int i=0;i<26;i++)
            {
                array[i] = Math.min(res[i],array[i]);
            }
        }
        List<String> result = new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            while(array[i]>0)
            {
                result.add(""+(char)(i+'a'));
                array[i]--;
            }
        }
        return result;
    }
}