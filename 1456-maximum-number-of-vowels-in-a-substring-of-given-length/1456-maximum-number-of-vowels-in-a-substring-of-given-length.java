class Solution {
    public int maxVowels(String s, int k) {
      int vowel=0;
      int max=0;
      for(int i=0;i<s.length();i++)
      {
          char c = s.charAt(i);
          if(isvowel(c))
          {
              vowel++;
          }
          if(i>=k)
          {
              char ch = s.charAt(i-k);
              if(isvowel(ch))
                  vowel--;
          }
          max=Math.max(max,vowel);
      }
        return max;
    }
    boolean isvowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            return true;
        return false;
        
    }
}

//Brute Force Approach 
/*
int max=0;
        for(int i=0;i<s.length()-k+1;i++)
        {
            String str = s.substring(i,i+k);
            int count=0;
            for(char c:str.toCharArray())
            {
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                {
                    count++;
                }
                max=Math.max(max,count);
            }  
        }
        return max;
*/