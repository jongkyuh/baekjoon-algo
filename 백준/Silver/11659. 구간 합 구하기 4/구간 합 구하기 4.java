import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] g = br.readLine().split(" ");
        int n = Integer.parseInt(g[0]);
        int m = Integer.parseInt(g[1]);

        int[] arr = new int[n];
        int[] fixarr = new int[n];

        String[] z = br.readLine().split(" ");

        // 입력된 배열 값 처리
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(z[i]);
        }

        // 누적 합 배열 생성
        fixarr[0] = arr[0];
        for (int j = 1; j < n; j++) {
            fixarr[j] = fixarr[j - 1] + arr[j];
        }

        // 쿼리 처리
        for (int k = 0; k < m; k++) {
            String[] aaa = br.readLine().split(" ");
            int a = Integer.parseInt(aaa[0]);
            int b = Integer.parseInt(aaa[1]);

            // a와 b가 뒤바뀐 경우 교환
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            // a가 1일 경우에는 fixarr[b-1]만 출력
            if (a == 1) {
                bw.write(fixarr[b - 1] + "\n");
            } else {
                // 그렇지 않으면 fixarr[b-1] - fixarr[a-2]로 구간 합 계산
                bw.write((fixarr[b - 1] - fixarr[a - 2]) + "\n");
            }
        }

        bw.flush();
    }
}
