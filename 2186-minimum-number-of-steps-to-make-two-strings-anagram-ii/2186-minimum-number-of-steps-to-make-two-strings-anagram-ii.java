class Solution {
    public int minSteps(String s, String t) {
        int ans = 0;
        int[] scounter = new int[26];
        int[] tcounter = new int[26];
        for(char ch:s.toCharArray())
        {
            scounter[ch-'a']++;
        }
        for(char ch:t.toCharArray())
        {
            tcounter[ch-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            ans += Math.abs(scounter[i]-tcounter[i]);
        }
        return ans;
    }
}