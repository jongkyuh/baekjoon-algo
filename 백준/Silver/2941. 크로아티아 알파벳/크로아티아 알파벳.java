import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("c=");
        set.add("c-");
        set.add("dz=");
        set.add("d-");
        set.add("lj");
        set.add("nj");
        set.add("s=");
        set.add("z=");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int len = str.length();
        int count = 0;
        int front = 0;
        int rear = 0;

        while (front < len) {
            // rear가 문자열의 길이를 넘어가지 않도록 조건 추가
            if (rear < len && set.contains(str.substring(front, rear + 1))) {
                ++count;
                front = rear + 1;  // 패턴을 찾으면 front를 rear+1로 이동
                rear = front;      // rear도 front와 같은 위치로 이동
            } else {
                if (rear + 1 < len) {
                    ++rear;  // rear가 문자열의 끝까지 다다르지 않았을 때만 증가
                } else {
                    ++count;  // 더 이상 매칭되는 패턴이 없을 때, 한 글자로 처리
                    ++front;  // front를 증가시켜 다음 글자로 이동
                    rear = front;  // rear도 front로 이동
                }
            }
        }

        System.out.println(count);
    }
}
