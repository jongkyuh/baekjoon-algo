import java.util.*;

public class Main{
    static long fivo(int n){
        if(n == 1 || n == 0) return n;
        return fivo(n-1) + fivo(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = fivo(n);
        System.out.println(result);
    }
}