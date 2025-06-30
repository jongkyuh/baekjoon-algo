import java.util.*;

public class Main{
    static int result = 0;
    static int recursion(String s, int l, int r){
        result++;
        if(l >= r)return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    static int isPalindrome(String s){
        return recursion(s, 0, s.length() - 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            int k = isPalindrome(s);
            System.out.println(k +" " + result);
            result = 0;
        }
    }
}