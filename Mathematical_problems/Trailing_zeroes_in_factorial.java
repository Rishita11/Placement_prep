/*

For an integer N find the number of trailing zeroes in N!.

Example 1:

Input:
N = 5
Output:
1
Explanation:
5! = 120 so the number of trailing zero is 1.

*/

class Solution{
    static int trailingZeroes(int N){
       int sum=0;
       for(int i=5;i<=N;i=i*5){
           sum+=N/i;
       }
       return sum;
    }
}
