// You are using Java
import java.util.*;
class test{
    
    static int find(int arr[],int n,int f,boolean s){
       int left=0;
       int right=n-1;
       int count=-1;
       while(left<=right){
           int mid=(left+right)/2;
           if(f==arr[mid]){
               count=mid;
               if(s){
                   right=mid-1;
               }
               else{
                   left=mid+1;
               }
           }
           else if(f<arr[mid]){
               right=mid-1;
           }
           else{
               left=mid+1;
           }
       }
       return count;
    }
    
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int f=sc.nextInt();
        int first=find(arr,n,f,true);
        int last=find(arr,n,f,false);
        int count=last-first+1;
        if(first!=-1)
         System.out.println(count);
    }
}
