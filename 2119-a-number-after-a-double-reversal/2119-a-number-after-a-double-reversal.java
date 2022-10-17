class Solution {
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
}