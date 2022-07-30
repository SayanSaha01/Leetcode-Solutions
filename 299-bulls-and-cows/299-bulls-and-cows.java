class Solution {
    public String getHint(String secret, String guess) {
        int a=0;
        for(int i=0;i<secret.length();i++)
        {
            if(secret.charAt(i)==guess.charAt(i))
            {
                a++;
                secret=secret.replaceFirst(""+secret.charAt(i),"");
                guess=guess.replaceFirst(""+guess.charAt(i),"");
                i--;
            }
        }
        int b=0;
        for(int i=0;i<guess.length();i++)
        {
            if(secret.contains(guess.charAt(i)+""))
            {
                b++;
                secret=secret.replaceFirst(""+guess.charAt(i),"");
            }
        }
        return a+"A"+b+"B";
    }
}