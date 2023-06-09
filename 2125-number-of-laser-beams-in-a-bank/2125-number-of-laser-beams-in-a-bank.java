class Solution {
    public int numberOfBeams(String[] bank) {
        int prev_beams=0;
        int curr_beams=0;
        int total_beams = 0;
        for(String str:bank)
        {
            int beams = findones(str);
            total_beams+=beams*prev_beams;
            if(beams!=0)
               prev_beams = beams;
        }
        return total_beams;
    }
    public int findones(String str)
    {
        int count=0;
        for(char c:str.toCharArray())
        {
            if(c=='1')
                count++;
        }
        return count;
    }
}