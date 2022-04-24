package Search;
import java.util.*;
public class Binary_Search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Binary_Search obj=new Binary_Search();
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		int element=sc.nextInt();
		int low=arr[0];
		int high=arr.length-1;
		/*Iterative Method
		 * int result= obj.bs(arr,element); if(result==-1)
		 * System.out.println("Element not present"); else
		 * System.out.println("Element present");
		 */
		int result=obj.br(arr, element,low,high);
		if(result==-1) {
			System.out.println("Element not present");
		}
		else {
			System.out.println("Element present");
		}

	}
	
	//Iterative Method
	public static int bs(int a[],int key) {
		int low=0,high=a.length-1;
		while(low<=high) {
			int mid =(low+high)/2;
			if(a[mid]==key) {
				return mid;
			}
			else if(key>a[mid]) {
				low=mid+1;
				
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}
	
	//Recursive Method
	public static int br(int a[],int key,int low,int high) {
		if(low>high) 
			return -1;
		int mid=(high+low)/2;
		if(a[mid]==key) 
			return mid;
		else if(key>a[mid])
			return br(a,key,mid+1,high);
		else
			return br(a,key,low,mid-1);
		
	}
}
