class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int k=0;
        for(int i:spaces)
        {
            sb.append(s.substring(k,i));
            k=i;
            sb.append(" ");
        }
        sb.append(s.substring(k,s.length()));
        return sb.toString();
    }
}