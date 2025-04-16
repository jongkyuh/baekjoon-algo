import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int n1 = sc.nextInt();
        sc.nextLine();
        
        String[] str1 = sc.nextLine().split(" ");
        for(String s : str1){
            set.add(Integer.parseInt(s));
        }
        
        int n2 = sc.nextInt();
        sc.nextLine();
        String[] str2 = sc.nextLine().split(" ");
        
        for(int i = 0; i < n2;i++){
            int getNum = Integer.parseInt(str2[i]);
            if(set.contains(getNum)) System.out.print(1 + " ");
               else System.out.print(0 + " ");
        }
        
        
    }
}