class Solution {
    public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> result = new ArrayList<>();            //used to store the result (all the possible combonations)
    List<Integer> combinations = new ArrayList<>();         
    
    solveitforMe(1,n,k,combinations,result);                
    return result;                
}

private void solveitforMe(int num, int n, int k, List<Integer> inner, List<List<Integer>> result){
    
    if(k==0) {
        result.add(new ArrayList<Integer>(inner));
        return;
    }
    for(int i=num;i<=n;i++) {
        inner.add(i);
        solveitforMe(i+1, n, k-1,inner,result);
        inner.remove(inner.size()-1);
    }
    return;
   }
}