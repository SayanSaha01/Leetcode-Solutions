/*class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].contains("--X"))
                x-=1;
            if(operations[i].contains("X++"))
                x+=1;
            if(operations[i].contains("++X"))
                x+=1;
            if(operations[i].contains("X--"))
                x-=1;
        }
        return x;
    }
}*/
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String s:operations)
        {
            if(s.contains("--X")||s.contains("X--"))
                x-=1;
            else
                x+=1;
        }
        return x;
    }
}