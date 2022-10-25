class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for(String str:word1)
        {
            s1+=str;
        }
        for(String st:word2)
        {
            s2+=st;
        }
        if(s1.equals(s2))
            return true;
        else
            return false;
    }
}