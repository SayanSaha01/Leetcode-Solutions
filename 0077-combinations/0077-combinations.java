class Solution {
    public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> result = new ArrayList<>();            //used to store the result (all the possible combonations)
    List<Integer> combinations = new ArrayList<>();            //use to store the combinations or we can say that subset
    
    solveitforMe(1,n,k,combinations,result);                   //Actual recursive logic
    
    return result;                
}

private void solveitforMe(int num, int n, int k, List<Integer> combinations, List<List<Integer>> result){
    
    if(num>n+1)      
        return;
    
    if(combinations.size() == k){             
        result.add(new ArrayList(combinations));      
        return;
    }
    
    combinations.add(num);                             
    solveitforMe(num+1,n,k,combinations,result);       
    combinations.remove(combinations.size()-1);         
    solveitforMe(num+1,n,k,combinations,result);        
    
   }
}