// You are using Java
import java.util.*;
class Main{
    public static int find(int arr[], int n,int k){
        if(n<=1)
        return 0;
        int profit[][]=new int[k+1][n+1];
        for(int i=0;i<=k;i++){
            int prev=Integer.MIN_VALUE;
            for(int j=-0;j<n;j++){
                if(i==0 || j==0){
                    profit[i][j]=0;
                }
                else{
                    prev=Math.max(prev,profit[i-1][j-1]-arr[j-1]);
                    profit[i][j]=Math.max(profit[i][j-1],arr[j]+prev);
                }
            }
        }
        return profit[k][n-1];
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Main obj=new Main();
        int ans=obj.find(arr,n,k);
        System.out.println(ans);
    }
}
