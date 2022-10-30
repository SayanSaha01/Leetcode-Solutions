class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<queries.length;i++)  //iterating over queries first as we need to mantain the relative order
        {
            String word = queries[i];
            for(int j=0;j<dictionary.length;j++)
            {
                int count=0;    //for every word in dictionary we are checking the number of mismatching letters
                String dict = dictionary[j];
                for(int k=0;k<dict.length();k++)
                {
                    if(word.charAt(k)!=dict.charAt(k))
                    {
                        count++;
                    }
                }
                if(count<=2)
                {
                    list.add(word);
                    break;
                }
            }
        }
        return list;
    }
}