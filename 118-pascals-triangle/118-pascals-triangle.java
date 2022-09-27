class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> prevrow=null;
        for(int i=0;i<numRows;i++)
        {
            List<Integer> row = new ArrayList<Integer>();
            for(int col=0;col<=i;col++)
            {
                if(col==0||col==i)
                {
                    row.add(1);
                }
                else
                {
                    row.add(prevrow.get(col)+prevrow.get(col-1));
                }
            }
            prevrow=row;
            list.add(row);
        }
        return list;
    }
}