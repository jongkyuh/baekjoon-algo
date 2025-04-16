import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Set<String> set = new HashSet<>();
        for(int i = 0; i < n;i++){
            String[] str = sc.nextLine().split(" ");
            if(str[1].equals("enter")){
                set.add(str[0]);
            }else{
                set.remove(str[0]);
            }
        }
        
        List<String> list = new ArrayList<>(set);
        
        list.sort((l1, l2) -> {
            return l2.compareTo(l1);
        });
        
        for(String s : list){
            System.out.println(s);
        }
    }
}