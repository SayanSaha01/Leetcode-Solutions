/*parseInt() returns primitive integer type (int), 
whereby valueOf returns java.lang.Integer, which is the object representative of the integer.*/

class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int a1= Integer.parseInt(num1.substring(0,num1.indexOf("+")));
        int a2= Integer.parseInt(num1.substring(num1.indexOf("+")+1,num1.length()-1));
        int b1= Integer.parseInt(num2.substring(0,num2.indexOf("+")));
        int b2= Integer.parseInt(num2.substring(num2.indexOf("+")+1,num2.length()-1));
        
        int a3=a1*b1+a2*b2*-1;
        int b3=a1*b2+a2*b1;
        return a3+"+"+b3+"i";
    }
}