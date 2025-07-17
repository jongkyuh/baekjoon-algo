import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String[] str1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int m = Integer.parseInt(str1[1]);
        String[] str = new String[n];    // str : 확인할 문자열 
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            String sefe = sc.nextLine();
            set.add(sefe);
        }
        
        for(int j = 0; j < m; j++){
            String s = sc.nextLine();
            if(set.contains(s)){
                count++;
              
            }
        }
        
        System.out.println(count);
    }
}