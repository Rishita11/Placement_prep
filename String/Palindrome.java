/*
Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome
*/
class Solution {
    int isPalindrome(String S) {
        String str=S;
        String str2="";
        int l=S.length();
        for(int i=l-1;i>=0;i--){
           str2+=S.charAt(i);
        }
       if(str.equals(str2)==true)
       return 1;
       else
       return 0;
    }
};
