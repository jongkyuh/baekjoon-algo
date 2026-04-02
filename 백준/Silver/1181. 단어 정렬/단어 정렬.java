import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        
        int N = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[N];
        for(int i = 0; i < N; i++){
            String s = sc.nextLine();
            if(!list.contains(s)) list.add(s);
        }
        
        list.sort((a,b) -> {
           if(Integer.compare(a.length(), b.length()) == 0){
               return a.compareTo(b);
           }
            return Integer.compare(a.length(), b.length());            
        });
        
        String[] result = list.stream().toArray(String[]::new);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
        
        
    }
}