class Solution {
    
    void f(Set<List<Integer>> ans, List<Integer> output, int[] a, int i){
        if(i >= a.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        
		// including
        output.add(a[i]);
        f(ans, output, a, i+1);
        
		// excluding
        output.remove(output.size()-1);
        f(ans, output, a, i+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] a) {
        
        // sorting because we don't want to add duplicate elements
        Arrays.sort(a);
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> output = new ArrayList();
        f(ans, output, a, 0);
        return new ArrayList<>(ans);
    }
}