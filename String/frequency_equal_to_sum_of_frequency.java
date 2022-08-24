// You are using Java
import java.util.*;
class test{
    
    static boolean find(String str){
        if(str.length()%2==1)
        return false;
        int[] freq=new int[26];
        
        //Update the frequency of each character
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]==str.length()/2)
            return true;
        }
        
        return false;
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
