package learn_array;
import java.util.*;
public class stock_sell_and_buy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<arr[i+1])
				max+=arr[i+1]-arr[i];
		}
		System.out.println(max);

	}

}
