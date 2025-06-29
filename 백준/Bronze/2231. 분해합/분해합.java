import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            int sum = i;
            int g = i;
            while(g > 0){
                sum += g % 10;
                g /= 10;
            }
            if(n == sum) {
                System.out.println(i); 
                return;
            } 
            
        }
        System.out.println(0); 
    }
}