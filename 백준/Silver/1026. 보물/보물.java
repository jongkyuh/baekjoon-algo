import java.util.*;

public class Main{
    public static void main(String[] args){
        int answer = 0; 
        Scanner sc = new Scanner(System.in);
         
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            B[i] = sc.nextInt();
        }
        
        Arrays.sort(B);
        int[] sortA = Arrays.stream(A).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        
        for(int i = 0; i < N; i++){
            answer += sortA[i] * B[i];
        }
        System.out.println(answer);
        
    }
}