/*Given two sequences, find the length of longest subsequence present in both of them. Both the strings are of uppercase.

Example 1:

Input:
A = 6, B = 6
str1 = ABCDGH
str2 = AEDFHR
Output: 3
Explanation: LCS for input Sequences
“ABCDGH” and “AEDFHR” is “ADH” of
length 3.*/

class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        int dp[][]=new int[x+1][y+1];
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                dp[i][j]=-1;
            }
        }
        return lcsUtil(x,y,s1,s2,dp);
     }
    static int lcsUtil(int x,int y, String s1, String s2, int dp[][]){
        if(x==0 ||y==0)
        return 0;
        
        if(dp[x][y]!=-1)
        return dp[x][y];
        
        if(s1.charAt(x-1)==s2.charAt(y-1)){
            dp[x][y]=1+lcsUtil(x-1,y-1,s1,s2,dp);
            
        }
        else{
            dp[x][y]=Math.max(lcsUtil(x,y-1,s1,s2,dp),lcsUtil(x-1,y,s1,s2,dp));
        }
        return dp[x][y];
    }
}
