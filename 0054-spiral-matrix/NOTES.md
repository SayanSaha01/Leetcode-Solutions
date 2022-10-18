class Solution {
public List<Integer> spiralOrder(int[][] matrix) {
int tne=matrix.length*matrix[0].length;
int rowmin=0, colmin=0, colmax=matrix[0].length-1, rowmax=matrix.length-1;
int count=0;
List<Integer> ans=new ArrayList<>();
while(count<tne){
//top wall
for(int i=colmin; i<=colmax && count<tne; i++){
ans.add(matrix[rowmin][i]);
count++;
}
rowmin++;
//right wall
for(int i=rowmin; i<=rowmax && count<tne; i++){
ans.add(matrix[i][colmax]);
count++;
}
colmax--;
//bottom wall
for(int i=colmax; i>=colmin && count<tne; i--){
ans.add(matrix[rowmax][i]);
count++;
}
rowmax--;
//left wall
for(int i=rowmax; i>=rowmin && count<tne;i--){
ans.add(matrix[i][colmin]);
count++;
}
colmin++;
}
return ans;
}
}