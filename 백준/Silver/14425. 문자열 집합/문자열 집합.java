import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        String[] strList = new String[n];
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < n; i++){
         set.add(sc.nextLine());
        }
        
        int count = 0;
        for(int i = 0 ; i < m; i++){
            String s = sc.nextLine();
            if(set.contains(s)){
                count++;
            } 
        }
        
        System.out.println(count);
    }
}