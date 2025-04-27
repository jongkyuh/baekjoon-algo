import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int current = 1; // 스택에 push할 다음 숫자

        for (int i = 0; i < n; i++) {
            int target = sc.nextInt();

            // 현재 push해야 할 숫자가 목표 숫자보다 작거나 같으면 push
            while (current <= target) {
                stack.push(current++);
                sb.append("+").append("\n");
            }

            // 스택의 top이 목표 숫자와 같은지 확인하고 pop
            if (!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                // 스택의 top이 목표 숫자와 다르거나 스택이 비어있으면 불가능
                System.out.println("NO");
                return; // 즉시 프로그램 종료
            }
        }

        System.out.print(sb.toString());
        sc.close();
    }
}