class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> list = new ArrayList<Long>();
        if(finalSum%2!=0)
            return list;
        
        long sum=finalSum;
        long num=2;
        while(num<=sum)
        {
            list.add(num);
            sum-=num;
            num+=2;
        }
        long last = list.remove(list.size()-1);
        list.add(last+sum);
        return list;
    }
}