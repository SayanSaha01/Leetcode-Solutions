class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> p = new PriorityQueue<>((a, b) -> {
            if (a.length() == b.length()) 
            {
                return b.compareTo(a);
            } 
            else if (a.length() < b.length()) 
            {
                return 1;
            } 
            else 
                return -1;
        });

        for (int i = 0; i < nums.length; i++) {
            p.add(nums[i]);
        }

        for (int i=1; i<k; i++) {
            p.poll();
        }

        return p.peek();
    }
}