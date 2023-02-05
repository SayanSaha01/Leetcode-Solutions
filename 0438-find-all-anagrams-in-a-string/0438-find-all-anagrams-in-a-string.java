class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lst = new ArrayList<>();
        
        int l = p.length();
        char[] arr = p.toCharArray();
        Arrays.sort(arr);
        String newstr = new String(arr);
        
        for(int i=0;i<=s.length()-l;i++){
            String str = s.substring(i,i+l);
            char[] arr2 = str.toCharArray();
            Arrays.sort(arr2);
            String str2 = new String(arr2);
            if(str2.equals(newstr)){
                lst.add(i);
            }
        }
        
        return lst;
    }
}