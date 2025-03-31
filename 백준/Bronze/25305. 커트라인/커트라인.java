import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int target = Integer.parseInt(str1[1]);
        String[] str2 = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = Integer.parseInt(str2[i]);
        }
        
        Arrays.sort(arr);
        
        System.out.println(arr[arr.length-target]);
    }
}