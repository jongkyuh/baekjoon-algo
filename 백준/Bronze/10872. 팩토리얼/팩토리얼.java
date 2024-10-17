import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        if(n == 0){
            System.out.println(1);
        }else{
             for(int i = 1; i <= n; i++){
                count *= i;
            }
                System.out.println(count);
        }      
        
        
    }
}