import java.util.*;

public class Main{
    static int check(int a, int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++){
            String[] str = sc.nextLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            
            System.out.println((a * b) / check(a,b));
        }
    }
}