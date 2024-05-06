import java.io.*;
import java.util.Arrays;
    

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nan = new int[9];
        int sum = 0;
        int bumIdx1 = 0;
        int bumIdx2 = 0;
        
        for(int i = 0;i<9;i++){
            nan[i] = Integer.parseInt(br.readLine());
            sum += nan[i];                
        }
        Arrays.sort(nan);
        
        for(int i = 0;i<nan.length-1;i++){
            for(int j = i+1;j<nan.length;j++){
                if(sum-nan[i]-nan[j] == 100){
                    bumIdx1 = i;
                    bumIdx2 = j;
                    break;
                }
            }
        }
        
        for(int i = 0;i<9;i++){
            if(i != bumIdx1 && i != bumIdx2){
                System.out.println(nan[i]);
            }
        }
    }
}