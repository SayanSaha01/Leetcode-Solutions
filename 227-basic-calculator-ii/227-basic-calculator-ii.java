class Solution {
    public int calculate(String s) {
        int res = 0, pre = 0, curr = 0;
    char sign = '+';
    char[] array = s.trim().toCharArray();
    for(int i=0; i<=array.length; i++){
        if(i!=array.length && Character.isDigit(array[i]))
            curr = curr*10 + array[i]-'0';
        else{
            if(i!=array.length && array[i]==' ') continue;
            if(sign=='+'){
                res += curr;
                pre = curr;
            }
            if(sign=='-'){
                res -= curr;
                pre = -curr;
            }
            if(sign=='*'){
                res = res - pre + pre*curr;
                pre = pre*curr;
            }
            if(sign=='/'){
                res = res - pre + pre/curr;
                pre = pre/curr;
            }
            curr = 0;
            if(i!=array.length) sign = array[i];
        }
    }
    return res;
    }
}