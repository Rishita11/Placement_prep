// You are using Java
import java.util.*;
class test{
    
    static int[] find(int arr[],int n){
        int ans[]=new int[n];
        List<Integer> list=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            if(s.isEmpty())
             list.add((int)-1);
            else if(s.peek()>arr[i])
              list.add(s.peek());
              else if(s.peek()<=arr[i]){
                  while(!s.isEmpty() && s.peek()<=arr[i]){
                      s.pop();
                  }
                  if(s.isEmpty()){
                      list.add((int)-1);
                  }
                  else
                  list.add(s.peek());
              }
              s.push(arr[i]);
        }
        int i=0;
        while(!list.isEmpty()){
            ans[i]=list.get(list.size()-1);
            list.remove(list.size()-1);
            i++;
        }
        return ans;
    }
    
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int ans[]=new int[n];
       ans=find(arr,n);
        for(int i=0;i<n;i++){
           System.out.println(arr[i]+" "+ans[i]);
        }
    }
}
