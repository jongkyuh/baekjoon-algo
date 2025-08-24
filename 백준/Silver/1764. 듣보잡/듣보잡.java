import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        sc.nextLine();
        
        for(int i = 0; i < N; i++){
            set.add(sc.nextLine());            
        }
        
        for(int i = 0; i < M; i++){
            String s = sc.nextLine();
            if(set.contains(s)) list.add(s);
        }
        System.out.println(list.size());
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        
    }
}