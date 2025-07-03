import java.util.*;

public class Main {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int[] result;
    static int order = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        result = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);  // ✅ 오름차순 정렬!
        }

        dfs(R);

        for (int i = 1; i <= N; i++) {
            System.out.println(result[i]);
        }
    }

    static void dfs(int cur) {
        visited[cur] = true;
        result[cur] = order++;

        for (int next : graph[cur]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
