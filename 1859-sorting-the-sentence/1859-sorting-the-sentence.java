class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        String[] res = new String[arr.length+1];
        int i=0;
        for(String key:arr)
        {
            i=(int)(key.charAt(key.length()-1)-'0');
            res[i-1]=key.substring(0,key.length()-1);
        }
        String p="";
        for(int j=0;j<res.length-1;j++)
        {
            p=p+res[j]+" ";
        }
        return p.trim();
    }
}