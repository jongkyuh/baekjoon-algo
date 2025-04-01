import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s = br.readLine()) != null) {
            int[] check = new int[4]; // 소문자, 대문자, 숫자, 공백 개수 저장

            for (char c : s.toCharArray()) {
                if ('a' <= c && c <= 'z') {  // 소문자
                    ++check[0];
                } else if ('A' <= c && c <= 'Z') { // 대문자
                    ++check[1];
                } else if ('0' <= c && c <= '9') { // 숫자
                    ++check[2];
                } else if (c == ' ') { // 공백
                    ++check[3];
                }
            }
            System.out.println(check[0] + " " + check[1] + " " + check[2] + " " + check[3]);
        }
    }
}
