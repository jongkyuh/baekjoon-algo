import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // 정점 수
        int m = sc.nextInt();  // 간선 수
        int r = sc.nextInt();  // 시작 정점

        List<Integer>[] edges = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            edges[i] = new ArrayList<>();
        }

        // 간선 정보 저장 (양방향)
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            edges[u].add(v);
            edges[v].add(u);
        }

        // 오름차순 방문을 위해 인접 리스트 오름차순 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(edges[i], Collections.reverseOrder()); // ✅ 스택 DFS이므로 내림차순 정렬!
        }

        boolean[] visited = new boolean[n + 1];
        int[] result = new int[n + 1];
        int seq = 1;

        Stack<Integer> stack = new Stack<>();
        stack.push(r);

        while (!stack.isEmpty()) {
            int now = stack.pop();

            if (visited[now]) continue;  // ❗ 이미 방문했다면 skip

            visited[now] = true;
            result[now] = seq++;

            for (int next : edges[now]) {
                if (!visited[next]) {
                    stack.push(next);  // ❗ visit은 여기서 하지 않는다!
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(result[i]);
        }
    }
}
