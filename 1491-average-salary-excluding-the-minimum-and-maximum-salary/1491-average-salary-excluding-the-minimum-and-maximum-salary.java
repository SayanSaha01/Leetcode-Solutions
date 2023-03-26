class Solution {
    public double average(int[] salary) {
        double avg=0;
        Arrays.sort(salary);
        int first = salary[0];
        int end = salary[salary.length-1];
        int count=0;
        for(int i:salary)
        {
            count++;
            avg+=i;
        }
        avg=avg-first-end;
        count=count-2;
        avg = (double)avg/count;
        return avg;
    }
}