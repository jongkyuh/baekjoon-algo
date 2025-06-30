import java.util.*;

public class Main{
    static long dfs(int n){
        if(n == 1 || n == 0) return 1;
        return n* dfs(n-1);
    }
    public static void main(String[] args){
        long answer = 1L;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        answer = dfs(n);
        System.out.println(answer);
    } 
}