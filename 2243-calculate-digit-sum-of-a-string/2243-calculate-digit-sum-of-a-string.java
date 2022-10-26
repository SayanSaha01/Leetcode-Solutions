class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k)
        {
            String newstr="";
            for(int i=0;i<s.length();i+=k)
            {
                int sum=0; //for storing the sum of the digits;
                String temp = s.substring(i,Math.min(i+k,s.length()));
                for(int j=0;j<temp.length();j++)
                {
                    sum+=temp.charAt(j)-'0';
                }
                newstr=newstr+""+sum;
            }
            s=newstr;
        }
        return s;
    }
}