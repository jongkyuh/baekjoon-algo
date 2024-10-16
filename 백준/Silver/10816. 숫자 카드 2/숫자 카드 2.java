import java.util.*;

public class Main{
    public static void main(String[] args){
        HashMap<String,Integer> hashmap = new HashMap<>();
        
        Scanner sc = new Scanner(System.in);
        
        int len = Integer.parseInt(sc.nextLine());        
        String[] str = sc.nextLine().split(" ");
        
        for(int i = 0; i < len; i++){
            hashmap.put(str[i],hashmap.getOrDefault(str[i],0) + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        int len2 = Integer.parseInt(sc.nextLine());
        String[] str2 = sc.nextLine().split(" ");
        for(int j = 0; j < len2; j++){
            int a = hashmap.getOrDefault(str2[j],0);
            sb.append(a + " ");
        }
        
        System.out.println(sb.toString().trim());
        
        
    }
}