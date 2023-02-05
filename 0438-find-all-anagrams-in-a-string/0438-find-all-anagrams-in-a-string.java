class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        int plen = p.length();
        char[] arr = p.toCharArray();
        Arrays.sort(arr);
        String str2 = new String(arr);
        
        for(int i=0;i<=s.length()-plen;i++)
        {
            String str1 = s.substring(i,i+plen);
            char[] prr = str1.toCharArray();
            Arrays.sort(prr);
            String str = new String(prr);
            if(str.equals(str2)==true)
                list.add(i);
        }
        return list;
    }
}