// You are using Java
import java.util.*;
class test{
    
    static boolean find(String str){
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i)!=str.charAt(i+2))
            return false;
        }
        
        if(str.charAt(0)==str.charAt(1))
        return false;
        
        return true;
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
