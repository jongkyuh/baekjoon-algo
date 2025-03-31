import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s1.length(); i++){
            sb.append(s1.charAt(s1.length() - 1 - i));
        }
        
        String s2 = sb.toString();
        
        if(s1.equals(s2)) System.out.println(1);
        else System.out.println(0);
    }
}