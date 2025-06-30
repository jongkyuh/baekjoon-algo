import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        String[] str = sc.nextLine().split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        
  
        Arrays.sort(arr);
        int sum = 0;
        int prefix = 0;
        for(int i = 0; i < n; i++){
            prefix += arr[i];
            sum += prefix;
        }
        
        System.out.println(sum);
    }
}