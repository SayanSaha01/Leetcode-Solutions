class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();
        for(char c:s.toCharArray())
        {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                list.add(c);
            }
        }
        Collections.sort(list);
        if(list.size()==0)
            return s;
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                sb.append(list.get(j));
                j++;
            }
            else
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}