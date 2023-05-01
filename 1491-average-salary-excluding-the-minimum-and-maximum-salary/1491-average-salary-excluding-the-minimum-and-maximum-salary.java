class Solution {
    public double average(int[] salary) {
        double avg_sal=0;
        Arrays.sort(salary);
        for(int i=0;i<salary.length;i++)
        {
            avg_sal+=salary[i];
        }
        avg_sal-=salary[0];
        avg_sal-=salary[salary.length-1];
        return avg_sal/(salary.length-2);
    }
}