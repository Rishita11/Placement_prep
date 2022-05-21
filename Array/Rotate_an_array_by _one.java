/*
Given an array, rotate the array by one position in clock-wise direction.
 

Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
*/

class Compute {
    
    public void rotate(int arr[], int n)
    {
    int b=arr[n-1];
    int c[]=new int[n];
    c[0]=b;
    for(int i=0;i<n-1;i++){
        c[i+1]=arr[i];
    }
   for(int i=0;i<n;i++){
       arr[i]=c[i];
   }
    
    }
}
