// You are using Java
import java.util.*;
class Main{
    static int pre(char ch){
        switch(ch){
            case '+':
            case  '-':
                return 1;
            case  '*':
            case  '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    
    static String find(String str){
        String res=new String("");
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            
            if(Character.isLetterOrDigit(c))
               res+=c;
               
            else if(c=='(')
               stack.push(c);
               
            else if(c==')'){
                while(!stack.isEmpty()&&stack.peek()!='(')
                   res+=stack.pop();
                   stack.pop();
            }
            else{
                while(!stack.isEmpty() && pre(c)<=pre(stack.peek())){
                    res+=stack.pop();
                }
                stack.push(c);
            }
        }
        
        while(!stack.isEmpty()){
            if(stack.peek()=='(')
              return "Invalid Expression";
             res+=stack.pop();
             }
            return res;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(find(str));
    }
}
