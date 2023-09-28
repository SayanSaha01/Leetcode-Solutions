class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int plen = p.length();
        char[] arr = p.toCharArray();
        Arrays.sort(arr);
        String str1 = new String(arr);
        for(int i=0;i<=s.length()-plen;i++)
        {
            String substr = s.substring(i,i+plen);
            char[] strr = substr.toCharArray();
            Arrays.sort(strr);
            String str2 = new String(strr);
            if(str1.equals(str2)){
                list.add(i);
            }
        }
        return list;
    }
}