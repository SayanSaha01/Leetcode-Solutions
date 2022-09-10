class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();

        if(n==1)
           return nums[0];

        for(int i=0; i<n; i++)
        {
            if(i!=0) 
                arr1.add(nums[i]);
            if(i!=n-1) 
                arr2.add(nums[i]);
        }

        return Math.max(solve(arr1),solve(arr2));
    }
    static int solve(ArrayList<Integer> arr){
    int n = arr.size();
    int prev2 =0;
    int prev1 = arr.get(0);
        
    for(int i=1; i<n; i++){
        int  incl = prev2 + arr.get(i);
        int excl = 0 + prev1;
        
        int ans = Math.max(incl, excl);
        prev2 = prev1;
        prev1 = ans;
        
       }
    return prev1;
    }
}