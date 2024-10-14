import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] g = new int[]{1,1,2,2,2,8};
        
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < str.length; i++){
            sb.append(Integer.toString(g[i]-Integer.parseInt(str[i])));
            sb.append(" ");
        }
        
        System.out.println(sb.toString().trim());
        
    }
}