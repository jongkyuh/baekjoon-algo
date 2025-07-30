import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        
        int[][] fibo = new int[41][2];
        fibo[0][0] = 1;
        fibo[0][1] = 0;
        fibo[1][0] = 0;
        fibo[1][1] = 1;
        for(int i = 2; i <= 40; i++){
            fibo[i][0] = fibo[i-2][0] + fibo[i-1][0];
            fibo[i][1] = fibo[i-2][1] + fibo[i-1][1];
        }
        
        
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            System.out.println(fibo[n][0] + " " + fibo[n][1]);            
        }
        
    }
}