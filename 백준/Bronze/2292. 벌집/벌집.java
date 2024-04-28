import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int sp = 1;
        int num = 1;
        if(n==1){
            System.out.println(1);
        }else{
            while(true){
               if((n-1)<sp){
                   System.out.println(count);
                   break;                                   
               }else{
                   ++count;
                   sp += 6*num;   
                   ++num; 
               } 
                
            }
        }
        
    }
}