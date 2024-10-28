import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arrList);
        
        for (int num : arrList) {
            bw.write(num + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
