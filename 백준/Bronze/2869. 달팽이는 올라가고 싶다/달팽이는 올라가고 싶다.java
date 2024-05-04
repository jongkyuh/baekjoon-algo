import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]); // 낮에 올라가는 높이
        int B = Integer.parseInt(input[1]); // 밤에 미끄러지는 높이
        int V = Integer.parseInt(input[2]); // 나무의 높이

        // 달팽이가 올라가는 높이를 계산하여 몇 일이 걸리는지 구함
        int days = (V - B - 1) / (A - B) + 1;

        bw.write(String.valueOf(days));
        bw.flush();
        bw.close();
        br.close();


    }
}
