/*
Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.


Example 1:

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
*/
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        int maxsum=arr[0];
        int cursum=0;
        for(int i=0;i<n;i++){
            cursum=Math.max(arr[i],cursum+arr[i]);
            
            if(cursum>maxsum){
                maxsum=cursum;
            }
            
        }
        
        return maxsum;
    }
    
}


