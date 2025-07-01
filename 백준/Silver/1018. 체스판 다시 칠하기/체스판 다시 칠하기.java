import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int N = Integer.parseInt(str[0]); // 행 (세로)
        int M = Integer.parseInt(str[1]); // 열 (가로)

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = sc.nextLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int wStart = 0;
                int bStart = 0;

                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        char expectedW = (x + y) % 2 == 0 ? 'W' : 'B';
                        if (board[i + x][j + y] != expectedW) wStart++;

                        char expectedB = (x + y) % 2 == 0 ? 'B' : 'W';
                        if (board[i + x][j + y] != expectedB) bStart++;
                    }
                }

                min = Math.min(min, Math.min(wStart, bStart));
            }
        }

        System.out.println(min);
    }
}
