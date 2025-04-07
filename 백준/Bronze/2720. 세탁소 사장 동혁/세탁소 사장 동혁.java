import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        // 25 10 5 1
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n;i++){
            int g = sc.nextInt();
            int a = g / 25;
            g = g % 25;
            int b = g / 10;
            g = g % 10;
            int c = g / 5;
            int d = g % 5;
            System.out.println("" + a + " " + b + " " + c + " " + d);
        }
    }
}