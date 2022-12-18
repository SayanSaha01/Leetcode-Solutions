class Solution {
    public int[] dailyTemperatures(int[] temp) {
        
        Map<Integer,Integer> map=new HashMap();
        
        int ans[]=new int[temp.length];
        Arrays.fill(ans,Integer.MAX_VALUE);
        
        for(int i=temp.length-1;i>=0;i--) {
            
            map.put(temp[i],i);
            for(Integer key : map.keySet())  {
                if(key>temp[i])
                    ans[i]=Math.min(ans[i],map.get(key)-i);
            }
        }
        
        for(int i=0;i<temp.length;i++)  {
        
            if(ans[i]==Integer.MAX_VALUE)
                ans[i]=0;
        }
        return ans;
    }
}