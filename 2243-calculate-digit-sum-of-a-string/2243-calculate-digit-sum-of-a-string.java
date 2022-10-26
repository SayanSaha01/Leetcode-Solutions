class Solution {
    public String digitSum(String s, int k) {
        String str = s;
        while(str.length()>k)
        {
            String newstr="";
            for(int i=0;i<str.length();i+=k)
            {
                int sum=0;
                for(int j=i;j<i+k && j<str.length();j++)
                {
                    sum += str.charAt(j)-'0';
                }
                newstr+=sum+"";
            }
            str=newstr;
        }
        return str;
    }
}