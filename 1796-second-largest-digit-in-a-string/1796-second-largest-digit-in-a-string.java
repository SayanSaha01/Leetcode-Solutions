class Solution {
    public int secondHighest(String s) {
        List<Integer> sh = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                set.add(s.charAt(i)-'0');
            }
        }
        for(int st:set)
        {
            sh.add(st);
        }
        Collections.sort(sh);
        if(sh.size()>1)
            return sh.get(sh.size()-2);
        return -1;
        
    }
}