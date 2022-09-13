class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(char ch:num.toCharArray())
        {
            int no = ch-'0';
            map.put(no,map.getOrDefault(no,0)+1);
        }
        for(int i=0;i<num.length();i++)
        {
            if(map.getOrDefault(i,0)!=num.charAt(i)-'0')
                return false;
        }
        return true;
        
    }
}