import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        
        int avg = (arr[0]+arr[1]+arr[2]+arr[3]+arr[4]) / 5;
        Arrays.sort(arr);
        
        System.out.println(avg);
        System.out.println(arr[2]);
    }
}