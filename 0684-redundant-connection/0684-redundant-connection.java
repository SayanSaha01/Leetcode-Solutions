//https://www.youtube.com/watch?v=S78QT118xP4

class Solution {
    int par[];
    public int findpar(int u){
        return par[u]==u?u:findpar(par[u]);
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        par=new int[n+1];
        
        for(int i=1;i<=n;i++){
            par[i]=i;
        }
        int ans[]=new int[2];
        for(int a[]:edges){
            int p1=findpar(a[0]);
            int p2=findpar(a[1]);
            
            if(p1==p2){
                ans=new int[]{a[0],a[1]};
            }else{
                par[p2]=p1;
            }
        }
        
        return ans;
    }
}