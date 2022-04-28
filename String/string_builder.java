package Learn_Strings;
import java.util.Scanner;
public class string_builder {

	public static void main(String[] args) {
		//Declaration
		StringBuilder sbr = new StringBuilder("Tony");
		System.out.println("String: "+sbr);
		System.out.println(sbr.charAt(3));
		
		//Insert
		System.out.println(sbr.insert(2, 'n'));
		
		//Delete
		System.out.println(sbr.delete(2, 3));
        
		//Append
		StringBuilder sb= new StringBuilder("R");
		sb.append('i');
		sb.append('s');
		sb.append('h');
		sb.append('i');
		sb.append('t');
		sb.append('a');
		System.out.println("String: "+sb);
		
	
	}

}
