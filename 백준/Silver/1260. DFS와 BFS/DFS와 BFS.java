import java.util.*;
import java.io.*;

public class Main {

    static void dfs(List<Integer>[] nodearr, int n, int start) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        boolean[] isVisit = new boolean[n + 1];

        // 오름차순으로 정렬 (DFS에서도 작은 번호부터 방문해야 함)
        for (int i = 1; i <= n; i++) {
            Collections.sort(nodearr[i]);
        }

        stack.push(start);
        isVisit[start] = true;
        sb.append(start).append(" "); // 시작 노드 방문 처리

        while (!stack.isEmpty()) {
            int current = stack.peek();
            boolean foundNext = false;
            for (int next : nodearr[current]) {
                if (!isVisit[next]) {
                    isVisit[next] = true;
                    sb.append(next).append(" ");
                    stack.push(next);
                    foundNext = true;
                    break; // 작은 번호부터 방문해야 하므로, 방문 후 바로 다음 탐색
                }
            }
            // 더 이상 방문할 인접 노드가 없으면 스택에서 pop
            if (!foundNext) {
                stack.pop();
            }
        }
        System.out.println(sb.toString().trim());
    }

    static void bfs(List<Integer>[] nodearr, int n, int start) {
        StringBuilder js = new StringBuilder();
        Deque<Integer> q = new ArrayDeque<>();
        boolean[] isVisit = new boolean[n + 1];

        // 오름차순으로 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(nodearr[i]);
        }

        q.addLast(start);
        isVisit[start] = true;

        while (!q.isEmpty()) {
            int num = q.pollFirst();
            js.append(num).append(" "); // 공백 추가

            for (int a : nodearr[num]) {
                if (!isVisit[a]) {
                    isVisit[a] = true;
                    q.addLast(a);
                }
            }
        }
        System.out.println(js.toString().trim());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]); // 노드의 개수
        int m = Integer.parseInt(str[1]); // 간선의 개수
        int start = Integer.parseInt(str[2]); // 시작 노드

        // 그래프 인접 리스트 초기화 (n+1 크기로 초기화, 1번부터 n번까지)
        List<Integer>[] nodearr = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            nodearr[i] = new ArrayList<>(); // 각 노드에 ArrayList 할당
        }

        // 간선 정보 입력
        for (int i = 0; i < m; i++) {
            String[] impl = br.readLine().split(" ");
            int a = Integer.parseInt(impl[0]);
            int b = Integer.parseInt(impl[1]);

            // 양방향 그래프이므로 양쪽에 모두 추가
            nodearr[a].add(b);
            nodearr[b].add(a);
        }

        // DFS 실행
        dfs(nodearr, n, start);

        // BFS 실행
        bfs(nodearr, n, start);
    }
}