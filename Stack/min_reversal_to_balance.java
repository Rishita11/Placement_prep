// You are using Java
import java.util.*;
class test{
    
    static int find(String str){
        int len=str.length();
        if(len%2!=0)
        return -1;
        int ans=0;
        int start=0,end=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='{')
            start++;
            else{
                if(start==0)
                  end++;
                else
                   start--;
            }
        }
        ans=(end/2)+(start/2);
        end%=2;
        start%=2;
        if(end!=0)
          ans+=2;
        return ans;
    }
    
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(find(str));
    }
}
