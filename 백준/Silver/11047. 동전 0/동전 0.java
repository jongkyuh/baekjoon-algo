import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        
        int n = Integer.parseInt(str[0]);
        int target = Integer.parseInt(str[1]);
        int[] coins = new int[n];
        for(int i = 0; i < n; i++){
            coins[i] = sc.nextInt();
        }
        int result = 0;
        
        while(target > 0){
            for(int i = n - 1; i >= 0; i--){
                if(target == 0) break;
                result += target / coins[i];
                target = target % coins[i];
            }
        }
        System.out.println(result);
    }
}