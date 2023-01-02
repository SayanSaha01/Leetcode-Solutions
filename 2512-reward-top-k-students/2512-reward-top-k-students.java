class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        HashSet<String> positive = new HashSet<>(Arrays.asList(positive_feedback));
        HashSet<String> negative = new HashSet<>(Arrays.asList(negative_feedback));
        int[][] arr = new int[report.length][2];
        for(int i=0;i<report.length;i++)
        {
            int score=0;
            String[] str = report[i].split(" ");
            for(String s:str)
            {
                if(positive.contains(s))
                    score+=3;
                if(negative.contains(s))
                    score-=1;
            }
            arr[i][0] = student_id[i];
            arr[i][1] = score;
        }
        Arrays.sort(arr,(a,b)->a[1]==b[1]?Integer.compare(a[0],b[0]):Integer.compare(b[1],a[1]));
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            list.add(arr[i][0]);
        }
        return list;
    }
}