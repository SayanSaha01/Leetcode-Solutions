class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            int[] freq = new int[26];
            for(int j=i;j<s.length();j++)   //j=i to indicate the starting position of the substring
            {
                freq[s.charAt(j)-'a']++;
                ans+=beauty(freq);
            }
        }
        return ans;
    }
    public int beauty(int[] freq)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<26;i++)
        {
            if(freq[i]==0)
                continue;
            max=Math.max(freq[i],max);
            min=Math.min(freq[i],min);
        }
        return max-min;
    }
}