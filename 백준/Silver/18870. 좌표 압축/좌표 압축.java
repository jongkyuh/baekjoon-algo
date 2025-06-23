import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        Set<Integer> set = new HashSet<>();
        String[] str = sc.nextLine().split(" ");
        for(int i = 0; i < n; i++){
            set.add(Integer.parseInt(str[i]));
        }
        List<Integer> list = new ArrayList<>(set);
        
        Collections.sort(list);
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            map.put(list.get(i), i);
        }
        
        StringBuilder sb = new StringBuilder();
        for(String s : str){
            sb.append(map.get(Integer.parseInt(s)));
            sb.append(" ");
        }
        
        System.out.println(sb.toString().trim());
        
    }
}