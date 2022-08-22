// You are using Java
import java.util.*;
class test{
    
    static boolean find(int arr[],int n){
        int size=arr.length;
        int i=0,j=1;
        while(i<size && j<size){
            if(i!=j && (arr[j]-arr[i]==n || arr[i]-arr[j]==n)){
                System.out.println("("+arr[i]+","+arr[j]+")");
                return true;
            }
            else if (arr[j]-arr[i]<n)
            j++;
            else
            i++;
        }
        System.out.println("No such pair");
        return false;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int diff=sc.nextInt();
        find(arr,diff);
        
    }
}
