package learn_array;
import java.util.*;
public class buy_and_sell_stock {
    static int maxProfit(int arr[],int n) {
    	int min=arr[0];
    	int max=0;
    	for(int i=0;i<n;i++) {
    		if(arr[i]<min)
    			min=arr[i];
    		int profit=arr[i]-min;
    		max=Math.max(profit, max);
    	}
    	return max;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	    buy_and_sell_stock obj=new buy_and_sell_stock();
	    int ans=obj.maxProfit(arr, n);
	    System.out.println(ans);
		
	}

}
