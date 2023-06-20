class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] answer = new int[queries.length];
        int j=0;
        for(String query:queries)
        {
            int val=0;
            for(String word:words)
            {
                if(frequency(word)>frequency(query))
                {
                    val++;
                }
            }
            answer[j]=val;
            j++;
        }
        return answer;
    }
    public int frequency(String word)
    {
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[0]==arr[i])
            {
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }
}