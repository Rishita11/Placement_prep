/*
Problem Statement:
You are given a string s. You need to reverse the string.
Example 1:
Input:
s = Geeks
Output: skeeG
*/

//Solution:

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        int len=str.length();
        String arr="";
        
        for(int i=len-1;i>=0;i--){
            arr+=str.charAt(i);
          
        }
        return arr;
    }
}
