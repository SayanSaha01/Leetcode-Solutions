class Solution {
    public List<List<Integer>> combinationSum(int[] a, int t) {
        List<List<Integer>> ans = new ArrayList<>(); // ans list
        List<Integer> ls = new ArrayList<>();  // our inside list to store different combinations
        int index = 0; // starting from index 0
        combSum(index,ans,a,t,ls); // recursive function
        return ans;
    }
    static void combSum(int i,List<List<Integer>>ans,int a[],int t,List<Integer> ds) {
        // Base condition
		if(i == a.length) {
            if(t == 0) {
                ans.add(new ArrayList<>(ds)); // ArrayList constructor constructs a list of specified collection, in our case it is List<Integer> ds
            }
            return;
        }
		
		// Check if the element at index is smaller than the target or not
        if(a[i] <= t) {
            ds.add(a[i]);
            combSum(i,ans,a,t-a[i],ds); // calls for same index and decreasing target by a[i]
            ds.remove(ds.size()-1); // during backtracking we will remove the added element in ds
        }
        combSum(i+1,ans,a,t,ds); // call for next index
    }
}