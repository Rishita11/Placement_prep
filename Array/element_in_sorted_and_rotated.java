/*
Given a sorted and rotated array A of N distinct elements which is rotated at some point, and given an element K. The task is to find the index of the given element K in the array A.

Example 1:

Input:
N = 9
A[] = {5 6,7,8,9,10,1,2,3}
K = 10
Output: 5
Explanation: 10 is found at index 5.*/

class Solution 
{ 
    static int Search(int array[], int target)
	{
	    int low=0;
	    int high=array.length-1;
	    while(low<=high){
	        int mid=(low+high)/2;
	        if(array[mid]==target) return mid;
	        if(array[low]<array[mid]){
	            if(target>=array[low]&& target<array[mid]){
	                high=mid-1;
	            }
	            else{
	                low=mid+1;
	            }
	        }
	        else{
	            if(target>array[mid] &&target<=array[high]){
	                low=mid+1;
	            }
	            else{
	                high=mid-1;
	            }
	        }
	    }
	    return -1;
	}
} 
