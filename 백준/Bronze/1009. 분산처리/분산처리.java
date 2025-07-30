import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int answer = 1;
            for(int j = 0; j < b; j++){
                answer = answer * a % 10;
            }
            if(answer == 0)  System.out.println(10);
            else  System.out.println(answer);
           
        }
    }
}