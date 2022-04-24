package Search;
import java.util.*;
public class Linear_Search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		int element=sc.nextInt();
		for(int i=0;i<5;i++) {
			if(arr[i]==element) {
				System.out.println("Element present");
			}
			else {
				System.out.println("Element not found");
			}
		}
	}
}
