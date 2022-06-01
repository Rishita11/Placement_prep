/*

Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
I 1
V 5
X 10
L 50
C 100
D 500
M 1000

Example 1:

Input:
s = V
Output: 5
Example 2:

Input:
s = III 
Output: 3

*/
class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
       int res=0;
       HashMap <Character,Integer> num=new HashMap<>();
       num.put('I',1);
       num.put('V',5);
       num.put('X',10);
       num.put('L',50);
       num.put('C',100);
       num.put('D',500);
       num.put('M',1000);
       
       for(int i=0;i<str.length();i++){
           if(i>0 && num.get(str.charAt(i))>num.get(str.charAt(i-1)))
            res+=num.get(str.charAt(i))-2*num.get(str.charAt(i-1));
           else
           res+=num.get(str.charAt(i));
          
       }
       return res;
       }
}
