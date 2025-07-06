import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int count = sc.nextInt();
        int[] numArr = new int[N];
        
        for(int i = 0; i < N; i++){
            numArr[i] = sc.nextInt();
        }
       
        int sum = 0;
        for(int i = 0; i < count; i++){
            sum += numArr[i];
        }
        int max = sum;
        for(int i = 1; i < N - count + 1; i++){            
            sum -= numArr[i-1];
            sum += numArr[i + count - 1];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}