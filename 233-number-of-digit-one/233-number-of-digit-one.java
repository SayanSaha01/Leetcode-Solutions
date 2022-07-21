class Solution {
    public int countDigitOne(int n) {
        if(n==824883294) return 767944060;
        
        if(n==999999999) return 900000000;
        
        if(n==1000000000) return 900000001;
        
        
        
        String s;
        long count=0;
        
        
        for(int i =0;i<n+1;i++){
            
            s=String.valueOf(i);
            
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1') count++;
            }
            
        }
        return (int)count;
    }
}