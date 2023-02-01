class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
            return "";
        int gcd = getgcd(str1.length(),str2.length());
        return str1.substring(0,gcd);
    }
    public int getgcd(int p,int q)
    {
        if(q==0)
            return p;
        else
            return getgcd(q,p%q);
    }
}