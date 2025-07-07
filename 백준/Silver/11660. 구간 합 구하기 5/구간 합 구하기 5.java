import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());    // N * N 배열
        int testcase = Integer.parseInt(st.nextToken());    // 테스트케이스 갯수
        
        int[][] arr = new int[N][N];        // 값 배열 
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j <N; j++){
                
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int[][] prefix = new int[N+1][N+1];    // 누적합 배열 
        for(int i = 1; i < N+1; i++){    // 누적합 계산
            for(int j = 1; j < N+1; j++){
                prefix[i][j] = prefix[i][j-1] + prefix[i-1][j] -
                                 prefix[i-1][j-1] + arr[i-1][j-1];
            }
        }
        
        // 테스트케이스
        for(int i = 0; i < testcase; i++){
            st = new StringTokenizer(br.readLine());
            int r1 = Integer.parseInt(st.nextToken());
            int c1 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());
            
            int result = prefix[r2][c2] - prefix[r1-1][c2]
                            - prefix[r2][c1-1] + prefix[r1-1][c1-1];
            System.out.println(result);
        }
        
    }
}