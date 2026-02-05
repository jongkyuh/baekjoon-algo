import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int n = s.length();

        // 회전을 위해 두 번 붙이기
        s = s + s;

        // 닫는 괄호 → 여는 괄호 매핑
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        // 회전 시작점 i
        for (int i = 0; i < n; i++) {

            Stack<Character> stack = new Stack<>();
            boolean check = true;

            // 길이 n만큼 검사
            for (int j = i; j < i + n; j++) {
                char c = s.charAt(j);

                // 여는 괄호면 push
                if (c == '{' || c == '(' || c == '[') {
                    stack.push(c);
                }
                // 닫는 괄호면 검사
                else {
                    if (stack.isEmpty() || !stack.pop().equals(map.get(c))) {
                        check = false;
                        break;
                    }
                }
            }

            // 검사 끝났는데 stack도 비어있으면 올바른 괄호
            if (check && stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
