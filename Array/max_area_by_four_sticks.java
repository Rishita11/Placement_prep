// You are using Java
import java.util.*;
class test{
    
    static int find(int arr[],int n){
        Set<Integer> s=new HashSet<>();
        int first=0,second=0;
        for(int i=0;i<n;i++){
            if(!s.contains(arr[i])){
                s.add(arr[i]);
                continue;
            }
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second)
            second=arr[i];
        }
        return (first*second);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(find(arr,n)>0)
        System.out.println(find(arr,n));
        else
        System.out.println("-1");
    }
}
