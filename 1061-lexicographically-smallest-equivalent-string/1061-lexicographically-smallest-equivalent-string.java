class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        char c[]=new char[26];
        for(int i=0;i<26;i++)
        {
            c[i]=(char)('a'+i);
        }
        for(int i=0;i<s1.length();i++)
        {
            char min_char='a';
            char max_char='a';
            if(c[s1.charAt(i)-'a']>c[s2.charAt(i)-'a']){
               min_char=c[s2.charAt(i)-'a'];
               max_char=c[s1.charAt(i)-'a'];
            }else{
               max_char=c[s2.charAt(i)-'a'];
               min_char=c[s1.charAt(i)-'a']  ;
            }
            
            for(int j=0;j<26;j++)
            {
                if(c[j]==max_char)c[j]=min_char;
            }
        }
        String res="";
        System.out.println(Arrays.toString(c));
        for(char ch:baseStr.toCharArray())
        {
            res+=c[ch-'a'];
        }

        return res;
   }
}
