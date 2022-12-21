class Solution {
    public long smallestNumber(long num) {
        if(num>0)
        {
            String s = String.valueOf(num);
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            int i=0;
            while(ch[i]=='0')
                i++;
            //since we are asked to find the smallest value, we will count the number of zero's and then replace zero as it comes first in ascending order with the immediate next non-zero number whose index we arrive at by counting the number of zero's 056 => 506
            char temp = ch[0];
            ch[0] = ch[i];
            ch[i] = temp;
            StringBuilder sb = new StringBuilder();
            for(char c:ch)
            {
                sb.append(c);
            }
            return Long.parseLong(sb.toString());
        }
        else      //if the number is negative
        {
            String s = String.valueOf(num);
            s = s.replace("-","");
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            StringBuilder sb = new StringBuilder();
            for(char c1:ch)
            {
                sb.append(c1);
            }
            return (-1)*Long.parseLong(sb.reverse().toString());
        }
    }
}