class Solution {
    public int bitwiseComplement(int n) {
        String cmp = "";
        String binary = Integer.toBinaryString(n);
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