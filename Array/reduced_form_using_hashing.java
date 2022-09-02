// You are using Java
import java.util.*;
class test{
    static void convert(int arr[],int n){
        int temp[]=arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<>();
        int val=0;
        for(int i=0;i<n;i++)
            map.put(temp[i],val++);
            
        for(int i=0;i<n;i++)
           arr[i]=map.get(arr[i]);
    }
    
    static void find(int arr[],int n){
        for(int i=0;i<n;i++)
          System.out.print(arr[i]+" ");
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        convert(arr,n);
        find(arr,n);
        
    }
}
