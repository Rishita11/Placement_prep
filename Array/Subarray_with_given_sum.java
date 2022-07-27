/*
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

In case of multiple subarrays, return the subarray which comes first on moving from left to right.

 

Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.*/
class Solution
{
   
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
         int start=0,end=-1,cursum=0;
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            cursum+=arr[i];
            if(cursum==s){
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(cursum-s)){
                start=map.get(cursum-s)+1;
                end=i;
                break;
            }
            map.put(cursum,i);
        }
        if(end!=-1){
            ans.add(0,start+1);
            ans.add(1,end+1);
        }
        else {
            ans.add(0,-1);
        }
        return ans; 
    }
}
