class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>();
        int[] target = new int[26];
        for(String b:words2)
        {
            int[] temp = new int[26];
            for(char ch:b.toCharArray())
            {
                temp[ch-'a']++;
                target[ch-'a']=Math.max(temp[ch-'a'],target[ch-'a']);
            }
        }
        for(String a:words1)
        {
            int[] source = new int[26];
            for(char ch:a.toCharArray())
            {
                source[ch-'a']++;
            }
            if (subset(source,target))
            {
                res.add(a);
            }
        }
        return res;
    }
    private boolean subset(int[] parent,int[] child)
    {
        for(int i=0;i<26;i++)
        {
            if(parent[i]<child[i])
                return false;
        }
        return true;
    }
}