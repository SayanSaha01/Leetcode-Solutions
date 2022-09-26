class Solution {
    public int findComplement(int num) {
        String cmp = "";
        String binary = Integer.toBinaryString(num);
        for(int i=0;i<binary.length();i++)
        {
            if(binary.charAt(i)=='0')
            {
                cmp+="1";
            }
            else
            {
                cmp+="0";
            }
        }
        return Integer.parseInt(cmp,2);
    }
}