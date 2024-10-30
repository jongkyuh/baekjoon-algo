import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "";
        char[] ch = str.toCharArray();
        for(char c : ch){
            if(Character.isUpperCase(c)){
                
                s += Character.toLowerCase(c);
            }else{
                s += Character.toUpperCase(c);
            }
        }

        System.out.println(s);
       
    }
}