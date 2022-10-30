class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<queries.length;i++)
        {
            String s = queries[i];
            for(int j=0;j<dictionary.length;j++)
            {
                int count=0;
                String str = dictionary[j];
                for(int k=0;k<str.length();k++)
                {
                    if(str.charAt(k)!=s.charAt(k))
                    {
                        count++;
                    }
                }
                if(count<=2)
                {
                    list.add(s);
                    break;
                }
            }
        }
        return list;
    }
}