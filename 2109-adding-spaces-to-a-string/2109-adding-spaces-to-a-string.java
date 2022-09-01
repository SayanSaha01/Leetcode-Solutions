class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int k=0;
        for(int i=0;i<spaces.length;i++)
        {
            sb.append(s.substring(k,spaces[i]));
            k=spaces[i];
            sb.append(" ");
        }
        sb.append(s.substring(k,s.length()));
        return sb.toString();
    }
}