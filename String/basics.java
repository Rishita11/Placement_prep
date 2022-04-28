package Learn_Strings;
import java.util.Scanner;
public class basics {

	public static void main(String[] args) {
	
		//Initialization
		String str="Tony";
		String str2="Stark";
		System.out.println(str+" "+str2);
		
		//Input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str1=sc.nextLine();
		System.out.println(str1);
		
		//Length of string
		int len=str.length();
		System.out.println("Lenght: "+len);
		
		//Compare
		if(str.compareTo(str1)==0)
			System.out.println("Both are same strings");
		else
			System.out.println("Both are different strings");
		
		//Substring of the string
		String substring=str1.substring(0,7);
		System.out.println("Sub string: "+substring);
		
	}

}
