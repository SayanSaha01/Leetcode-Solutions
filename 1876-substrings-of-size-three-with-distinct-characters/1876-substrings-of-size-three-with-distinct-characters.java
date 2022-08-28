class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()-2;i++)
        {
            HashSet<Character> set = new HashSet<Character>();
            String s1 = s.substring(i,i+3);
            char[] arr = s1.toCharArray();
            for(char c:arr)
            {
                set.add(c);
                if(set.size()==3)
                    count++;
            }
        }
        return count;
    }
}