class Solution {
    public boolean areNumbersAscending(String s) {
        int prev=0;
        for(String str:s.split(" "))
        {
            if(Character.isDigit(str.charAt(0)))
            {
                int num = Integer.parseInt(str);
                if(num<=prev)
                    return false;
                else
                    prev=num;
            }
        }
        return true;
    }
}