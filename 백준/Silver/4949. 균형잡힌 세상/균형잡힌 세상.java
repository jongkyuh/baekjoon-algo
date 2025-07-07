import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Character, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        map.put(')', '(');
        map.put(']', '[');

        while (true) {
            String s = br.readLine();
            if (s.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean check = true;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (map.containsKey(c)) {
                    if (stack.isEmpty() || stack.peek() != map.get(c)) {
                        check = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (check && stack.isEmpty()) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }

        System.out.print(sb);
    }
}
