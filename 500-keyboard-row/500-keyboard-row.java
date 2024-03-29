class Solution {
    public String[] findWords(String[] words) {
        String s1="qwertyuiop",s2="asdfghjkl",s3="zxcvbnm";
        List<String> list = new ArrayList<String>();
        for(int i=0;i<words.length;i++)
        {
            int count1=0,count2=0,count3=0;
            for(int j=0;j<words[i].length();j++)
            {
                if(s1.indexOf(words[i].toLowerCase().charAt(j))!=-1)
                    count1++;
                if(s2.indexOf(words[i].toLowerCase().charAt(j))!=-1)
                    count2++;
                if(s3.indexOf(words[i].toLowerCase().charAt(j))!=-1)
                    count3++;
            }
            if((count1==words[i].length())||(count2==words[i].length())||(count3==words[i].length()))
                list.add(words[i]);
        }
        String[] ans = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}