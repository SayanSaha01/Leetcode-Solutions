class Solution {
    public String getHint(String secret, String guess) {
        int bulls=0;
        int cows=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<guess.length();i++)
        {
            if(secret.charAt(i)==guess.charAt(i))
            {
                bulls++;
            }
            else
            {
                map.put(guess.charAt(i),map.getOrDefault(guess.charAt(i),0)+1);
            }
        }
        for(int i=0;i<secret.length();i++)
        {
            if(map.containsKey(secret.charAt(i)) 
            && secret.charAt(i)!=guess.charAt(i) 
            && map.get(secret.charAt(i))>0)
            {
                cows++;
                map.put(secret.charAt(i),map.get(secret.charAt(i))-1);
            }
            else if(!map.containsKey(secret.charAt(i))){
                continue;
            }
        }
        return bulls+"A"+cows+"B";
    }
}