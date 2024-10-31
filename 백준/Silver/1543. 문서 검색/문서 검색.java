import java.util.*;

// The main method must be in a class named "Main".
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String s = sc.nextLine();
        int count = 0;
        for(int i = 0; i < doc.length();i++){
             boolean is = true;
            for(int j = 0; j < s.length(); j++){
               
                if(i+j >= doc.length() || s.charAt(j) != doc.charAt(i+j)){
                    is = false;
                    break;
                }
            }
            if(is){
            ++count;
            i+=s.length()- 1;
        }
        }

        
        System.out.println(count);
    }
}
    