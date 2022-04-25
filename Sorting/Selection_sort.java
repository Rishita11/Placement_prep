package Sorting;
import java.util.*;
public class Selection_sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(min!=i) {
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
