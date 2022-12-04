class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i=0;
        int j=skill.length-1;
        int sum=skill[i]+skill[j];
        long product=skill[i]*skill[j];
        i++;
        j--;
        while(i<j){
            if(sum!=skill[i]+skill[j]){
                return -1;
            }
            else{
                product+=skill[i]*skill[j];
                i++;
                j--;
            }
        }
        return product;
    }
}