class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        HashMap<Integer,Integer> h= new HashMap<>();

        int n1=nums1.length;
        int n2=nums2.length;

        for(int j=n2-1;j>=0;j--)
        {
                while(s.isEmpty()==false && s.peek()<nums2[j])
                     s.pop();

                h.put(nums2[j],s.isEmpty()?-1:s.peek());

                s.push(nums2[j]);
        }

        for(int i =0;i<n1;i++)
                nums1[i]=h.get(nums1[i]);


        return nums1;
        
    }
}