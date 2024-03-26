import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num1 = sc.nextInt();
        
        System.out.println(str.substring(num1-1,num1));
    }
}