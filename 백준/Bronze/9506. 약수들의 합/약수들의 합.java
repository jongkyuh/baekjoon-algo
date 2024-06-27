import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));                                    
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == -1){
                bw.flush();
                break;
            }
            ArrayList<Integer> arrList = new ArrayList<>();
            arrList.add(1);
            for(int i = 2;i<n;i++){
                if(n % i == 0){
                    arrList.add(i);
                }
            }
            
            int hap = 0;
            for(int i = 0; i < arrList.size();i++){
                hap += arrList.get(i);
            }
            
            if(hap == n){
                bw.write(Integer.toString(n) + " = ");
                for(int i = 0; i < arrList.size() -1; i++){
                    bw.write(Integer.toString(arrList.get(i)) + " + ");
                }
                bw.write(Integer.toString(arrList.get(arrList.size()-1)));
            }else{
                bw.write(Integer.toString(n) + " is NOT perfect.");
            }
            bw.write("\n");
            
            
            
        }
    }
}