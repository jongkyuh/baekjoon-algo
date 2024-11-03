import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 읽기
        String[] wh = br.readLine().split(" ");
        int w = Integer.parseInt(wh[0]);
        int h = Integer.parseInt(wh[1]);

        String[] pq = br.readLine().split(" ");
        int p = Integer.parseInt(pq[0]);
        int q = Integer.parseInt(pq[1]);

        int t = Integer.parseInt(br.readLine());

        // x 방향 이동 계산
        int timeX = t % (2 * w);
        int currentX = p;
        int deltaX = 1;

        while (timeX-- > 0) {
            if (currentX == w) deltaX = -1;
            else if (currentX == 0) deltaX = 1;
            currentX += deltaX;
        }

        // y 방향 이동 계산
        int timeY = t % (2 * h);
        int currentY = q;
        int deltaY = 1;

        while (timeY-- > 0) {
            if (currentY == h) deltaY = -1;
            else if (currentY == 0) deltaY = 1;
            currentY += deltaY;
        }

        // 결과 출력
        bw.write(currentX + " " + currentY + "\n");
        bw.flush();
        bw.close();
    }
}
