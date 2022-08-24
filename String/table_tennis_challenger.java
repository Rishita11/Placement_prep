// You are using Java
import java.util.*;
class test{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] p=s.toCharArray();
        boolean win=false;
        int sum=0;
        int total=0;
        while(total<p.length){
            int value=1;
            if(p[total]=='0'){
                 value=0;
            }
            total++;
            sum+=value;
            
        if(sum==10 &&total-sum==10){
            int gain=0;
            for(int j=total;j<=p.length-1;j++){
                int prev=gain;
                if(p[j]=='1'){
                    gain+=1;
                }
                else
                gain+=-1;
                
               if(gain!=0 && gain>=prev && gain>=2){
                   win=true;
                   break;
               }
               else if(gain!=0 && gain<=prev && gain<=-2){
                   break;
               }
            }
            break;
        }
        else if(sum==11){
            win=true;
            break;
        }
        else if(total-sum==11){
            break; //Player loses when the opponent gains 11 points
        }
        }
        if(win){
            System.out.println("Win");
        }
        else{
            System.out.println("Lose");
        }
    }
    
}
