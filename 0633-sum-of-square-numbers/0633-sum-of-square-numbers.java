
class Solution {
    public boolean judgeSquareSum(int c) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<=Math.sqrt(c);i++)
        {
            set.add(i*i);
        }
        for(int i=0;i<=Math.sqrt(c);i++)
        {
            if(set.contains(c-i*i))
                return true;
        }
        return false;
    }
}