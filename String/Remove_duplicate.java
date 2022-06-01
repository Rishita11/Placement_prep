/*
Given a string Str which may contains lowercase and uppercase chracters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

Example 1:

Input:
Str = geeksforgeeks
Output: geksfor
Explanation: After removing duplicate
characters such as e, k, g, s, we have
string as "geksfor".
*/

class Solution {
    String removeDuplicates(String str) {
        
        String res="";
        int l=str.length();
        for(int i=0;i<l;i++){
           if(res.indexOf(str.charAt(i))<0)
           res+=str.charAt(i);
        }
       return res;
    }
}
