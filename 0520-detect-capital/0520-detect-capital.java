class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            int ascii = (int) ch;
            if(ascii>=65 && ascii<=90)
                count++;
        }
        char c = word.charAt(0);
        int f = (int) c;
        return (count==word.length() || count==0 || ((count==1) && (f>=65 && f<=90)))?true:false;   
    }
}