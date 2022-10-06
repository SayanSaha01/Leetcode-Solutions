/*class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<>(){
            public int compare(Integer a,Integer b)
            {
                if(Math.abs(a-x)==Math.abs(b-x))
                    return Integer.compare(a,b);
                else
                    return Integer.compare(Math.abs(a-x),Math.abs(b-x));
            }
        });
        for(int n:arr)
        {
            pq.add(n);
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<k;i++)
        {
            list.add(pq.poll());
        }
        Collections.sort(list);
        return list;
    }
}*/
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int start=0;
        int end=arr.length-1;
        while(end-start>=k)
        {
            if(Math.abs(arr[start]-x)>Math.abs(arr[end]-x))
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        for(int i=start;i<=end;i++)
        {
            list.add(arr[i]);
        }
        return list;
    }
}