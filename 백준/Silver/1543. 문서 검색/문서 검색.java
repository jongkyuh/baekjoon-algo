import java.util.*;

// The main method must be in a class named "Main".
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String s = sc.nextLine();
        int count = 0;
        int index = 0;
        
        while(true){
            int find = doc.indexOf(s,index);
            if(find < 0){
                break;
            }
            count++;
            index = find + s.length();
            
            
        }

        
        System.out.println(count);
    }
}
    