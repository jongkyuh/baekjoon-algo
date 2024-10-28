import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] str = sc.nextLine().split(" ");
        int[] n = new int[8];
        String s = "";
        for(int i = 0; i < 8;i++){
            n[i] = Integer.parseInt(str[i]);
        }
        
        for(int i = 0; i < n.length- 1;i++){
           if(n[i+1] == n[i] + 1){
               s = "ascending";
           }else if(n[i] - 1 == n[i+1]){
               s = "descending";
           }else{
               s = "mixed";
               break;
           }
        }
        
        
        System.out.println(s);
    }
}