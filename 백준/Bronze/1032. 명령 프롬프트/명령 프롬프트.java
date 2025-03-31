import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        StringBuilder sb = new StringBuilder();
        int length = str[0].length(); // 파일 이름의 길이 (모든 파일 이름의 길이는 동일)

        for (int i = 0; i < length; i++) {
            char c = str[0].charAt(i); // 첫 번째 파일의 i번째 문자
            boolean check = true;

            for (int j = 1; j < n; j++) { // 모든 파일의 i번째 문자를 비교
                if (str[j].charAt(i) != c) {
                    check = false;
                    break;
                }
            }

            if (check) {
                sb.append(c);
            } else {
                sb.append('?');
            }
        }

        System.out.println(sb.toString());
    }
}
