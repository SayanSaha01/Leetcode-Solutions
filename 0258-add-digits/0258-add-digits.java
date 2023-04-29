class Solution {
    public int addDigits(int num) {
        int sum=0;
        String s = String.valueOf(num);
        for(int i=0;i<=s.length()-1;i++)
        {
            sum+=s.charAt(i)-'0';
        }
        if(sum<10)
            return sum;
        else
            return addDigits(sum);
    }
}