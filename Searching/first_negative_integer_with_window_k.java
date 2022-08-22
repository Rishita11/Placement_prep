// You are using Java
import java.util.*;
class MyClass{
    
    public long[] find(long A[],int n,int k){
        ArrayList<Long> al=new ArrayList<>();
        Queue<Long> q=new ArrayDeque<>();
        int i=0;
        int j=0;
        while(j<n){
            if(A[j]<0){
                q.add(A[j]);
            }
            if((j-i+1)<k){
                j++;
            }
            else if((j-i+1)==k){
                if(q.isEmpty()){
                    al.add((long)0);
                }
                else{
                    al.add(q.peek());
                }
                if(!q.isEmpty()&&A[i]==q.peek()){
                    q.remove();
                }
                i++;
                j++;
            }
        }
        long[] ans=new long[al.size()];
        for(int z=0;z<al.size();z++){
            ans[z]=al.get(z);
        }
        return ans;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MyClass obj=new MyClass();
        long ans[]=obj.find(arr,n,k);
        int s=ans.length;
        StringBuilder output=new StringBuilder();
        for(int i=0;i<s;i++)
            output.append(ans[i]+" ");
        System.out.println(output);   
        
    }
}
