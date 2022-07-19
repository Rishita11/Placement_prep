/*
Given string str, find the length of the longest repeating subsequence such that it can be found twice in the given string.

The two identified subsequences A and B can use the same ith character from string str if and only if that ith character has different indices in A and B. For example, A = "xax" and B = "xax" then the index of first "x" must be different in the original string for A and B.

Example 1:

Input:
str = "axxzxy"
Output: 2
Explanation:
The given array with indexes looks like
a x x z x y 
0 1 2 3 4 5*/

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        int n=str.length();
        String s=str;
        int m=s.length();
        int dp[][]= new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(str.charAt(i-1)==s.charAt(j-1) && i!=j)
               dp[i][j]=dp[i-1][j-1]+1;
               else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
   
      
    
}
