import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> q1 = new ArrayDeque<>();
        Queue<String> q2 = new ArrayDeque<>();

        for (String s : cards1) q1.add(s);
        for (String s : cards2) q2.add(s);

        for (String word : goal) {

            if (!q1.isEmpty() && q1.peek().equals(word)) {
                q1.poll();

            } else if (!q2.isEmpty() && q2.peek().equals(word)) {
                q2.poll();

            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
