import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String a = br.readLine();
        String[] b = a.split(" ");
        
        int n = Integer.parseInt(b[0]);
        int m = Integer.parseInt(b[1]);
        HashMap<String,String> hashMap = new HashMap<>();
        
        for(int i = 0;i<n;i++){
            String str = br.readLine();
            String[] str2 = str.split(" ");
            hashMap.put(str2[0],str2[1]);            
        }
        
        for(int i = 0;i<m;i++){
            String s = br.readLine();
            wr.write(hashMap.get(s)+"\n");
        }
        
        wr.flush();
        wr.close();
        br.close();

    }
}