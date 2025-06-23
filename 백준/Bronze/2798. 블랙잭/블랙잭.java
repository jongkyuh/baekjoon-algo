import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int target = Integer.parseInt(str[1]);
                           
        str = sc.nextLine().split(" ");
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(arr);
        int max = 0;
        for(int i = 0; i < arr.length - 2; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                for(int k = j + 1; k < arr.length; k++){
                    int hap = arr[i] + arr[j] + arr[k];
                    if( hap <= target){
                        max = Math.max(hap, max);
                    }
                }
            }
        }
        System.out.println(max);
        
         
    }
}