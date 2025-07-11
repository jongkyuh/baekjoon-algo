import java.util.*;

public class Main{
    static int[] arr;
    static void change(int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int testcase = sc.nextInt();
        arr = new int[N+1];
        for(int i = 0; i < N+1; i++){
            arr[i] = i;
        }
        for(int i = 0; i < testcase; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            change(start, end);
        }
        
        for(int i = 1; i < N+1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}