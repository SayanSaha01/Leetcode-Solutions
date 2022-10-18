class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int tne=matrix.length * matrix[0].length;
        int startrow = 0;
        int bottomrow = matrix.length-1;
        int leftcol = 0;
        int rightcol = matrix[0].length-1;
        int count=0;
        while(count<tne)
        {
            //top row
            for(int i=leftcol;i<=rightcol && count<tne;i++)
            {
                list.add(matrix[startrow][i]);
                count++;
            }
            startrow++;
            
            // right column
            for(int i=startrow;i<=bottomrow && count<tne;i++)
            {
                list.add(matrix[i][rightcol]);
                count++;
            }
            rightcol--;
            
            // bottom row
            for(int i=rightcol;i>=leftcol && count<tne; i--)
            {
                list.add(matrix[bottomrow][i]);
                count++;
            }
            bottomrow--;
            
            // left col
            for(int i=bottomrow;i>=startrow && count<tne;i--)
            {
                list.add(matrix[i][leftcol]);
                count++;
            }
            leftcol++;
        }
        return list;
    }
}