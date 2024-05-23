import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        HashMap<String,Integer> total = new HashMap<>();
        String[] check = new String[n-1];
        for(int i = 0;i < n;i++){
            String s = br.readLine();
            total.put(s,total.getOrDefault(s,0)+1);
        }
        
        for(int i = 0;i<n-1;i++){
            String s = br.readLine();
           total.put(s,total.get(s)-1); 
        }
        
        for(String s : total.keySet()){
            if(total.get(s)>0){
                 bw.write(s);
                bw.newLine(); // 줄바꿈 추가
                break;
            }
        }
        
         bw.flush();
        bw.close();
        br.close();
    }
}