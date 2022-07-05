import java.util.*;
class find{
    static void tower(int ht[],int n,int s[]){
        Stack<Integer> st= new Stack<>();
        st.push(0);
        s[0]=1;
        for(int i=1;i<n;i++){
          int counter=1;
          while((i-counter)>=0 && ht[i]>ht[i-counter]){
              counter+=s[i-counter];
          }
          s[i]=counter;
       }
    }
    static void pfinal(int arr[],int n){
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s[]=new int[n];
        int ht[]=new int[n];
        for(int i=0;i<n;i++){
            ht[i]=sc.nextInt();
        }
        tower(ht,n,s);
        pfinal(s,n);
    }
}
