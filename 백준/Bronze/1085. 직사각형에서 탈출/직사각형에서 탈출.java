import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int x = Math.min(a, c-a);
        int y = Math.min(b, d-b);
        System.out.println(Math.min(x,y));
    }
}