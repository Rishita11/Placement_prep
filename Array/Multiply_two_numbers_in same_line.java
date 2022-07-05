import java.util.*;

public class space
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println();
		
		int a[]=new int[3];
		String s[]= scan.nextLine().split(" ");
		for(int i =0 ;i < s.length;i++){
		 a[i]= Integer.parseInt(s[i]);
		}
		int count=0;
		int num=a[0]; int m=a[1]; int n=a[2];
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if((i*j)==num)
					count++;
			}
		}
		System.out.println(count);
	}
}
