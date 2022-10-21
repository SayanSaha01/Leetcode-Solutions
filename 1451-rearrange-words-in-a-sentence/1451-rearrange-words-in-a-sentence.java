class Solution {
    public String arrangeWords(String text) {
        String[] alpha = text.split(" ");
        
        Arrays.sort(alpha,(s1,s2)->s1.length()-s2.length());
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<alpha.length;i++)
        {
            if(i==0)
            {
                sb.append(alpha[i].substring(0,1).toUpperCase()+alpha[i].substring(1).toLowerCase());
            }
            else
            {
                sb.append(alpha[i].toLowerCase());
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}