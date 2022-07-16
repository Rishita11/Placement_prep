/*Given a rod of length N inches and an array of prices, price[] that contains prices of all pieces of size smaller than N. Determine the maximum value obtainable by cutting up the rod and selling the pieces.

 

Example 1:

Input:
N = 8
Price[] = {1, 5, 8, 9, 10, 17, 17, 20}
Output:
22
Explanation:
The maximum obtainable value is 22 by
cutting in two pieces of lengths 2 and 
6, i.e., 5+17=22.*/

class Solution{
    public int cutRod(int price[], int n) {
        
        int t[]=new int[n+1];
       
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                t[i]=Math.max(t[i],price[j]+t[i-j-1]);
                
            }
        }
        return t[n];
        
            }
}
