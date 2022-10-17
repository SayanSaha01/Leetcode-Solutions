/*class Solution {
    public boolean isSameAfterReversals(int num) {
        int bnum=num;
        for(int i=0;i<2;i++)
        {
            String s = String.valueOf(bnum);
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            bnum = Integer.parseInt(sb.toString());
        }
        return bnum==num?true:false;
    }
}*/

class Solution {
    public boolean isSameAfterReversals(int num) {
        int num1 = reverse(num);
        int num2 = reverse(num1);
        return num==num2 ? true:false;
    }
    public int reverse(int num)
    {
        int rev=0;
        while(num!=0)
        {
            int n = num%10;
            rev = rev*10+n;
            num=num/10;
        }
        return rev;
    }
}