/*
Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas the other two number occur exactly once and are distinct. Find the other two numbers.


Example 1:

Input: 
N = 2
arr[] = {1, 2, 3, 2, 1, 4}
Output:
3 4 
Explanation:
3 and 4 occur exactly once.
*/

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        int res=0,a=0,b=0;
        for(int i=0;i<nums.length;i++){
            res=nums[i]^res;
        }
        res= res & -res;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&res)>0)
              a=a^nums[i];
            else
              b=b^nums[i];
        }
        int ans[]=new int[2];
        ans[0]=a;
        ans[1]=b;
        Arrays.sort(ans);
        return ans;
    }
}
