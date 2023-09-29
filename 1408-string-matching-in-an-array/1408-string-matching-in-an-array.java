class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<String>();
        for(int i=0;i<words.length;i++)
        {
            String str1=words[i];
            for(int j=0;j<words.length;j++)
            {
                String str2=words[j];
                if(str2.contains(str1) && i!=j)
                {
                    list.add(str1);
                    break;
                }
            }
        }
        return list;
    }
}