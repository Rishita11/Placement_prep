// You are using Java
import java.util.*;
class test{
    
    static boolean find(String str){
        int sum=0;
        for(int i=0;i<str.length();i++)
         sum+=str.charAt(i)-'0';
        return (sum==(str.length()-1)||sum==1);
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(find(str))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
