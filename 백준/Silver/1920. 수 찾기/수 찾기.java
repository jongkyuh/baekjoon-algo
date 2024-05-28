import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        int n = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");
        for(int i = 0; i < n;i++){
            hashSet.add(Integer.parseInt(str[i]));
        }
        
        int m = Integer.parseInt(sc.nextLine());
        String[] str2 = sc.nextLine().split(" ");
        for(int i = 0; i<m;i++){
            if(hashSet.contains(Integer.parseInt(str2[i]))){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}