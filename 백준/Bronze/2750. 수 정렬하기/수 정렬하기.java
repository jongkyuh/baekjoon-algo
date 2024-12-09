import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}