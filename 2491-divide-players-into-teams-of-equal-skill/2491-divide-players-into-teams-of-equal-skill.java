class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        int start=0;
        int end=n-1;
        int x1 = skill[start];
        int x2 = skill[end];
        long sum=x1+x2;
        long pro=0;
        while(start<end)
        {
            if(skill[start]+skill[end]!=sum)
                return -1;
            else
            {
                pro+=skill[start]*skill[end];
                start++;
                end--;
            }
        }
        return pro;
    }
}