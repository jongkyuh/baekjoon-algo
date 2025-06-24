import java.util.*;

public class Main {
    static int N;
    static int M;

    static void dfs(int count, int target, List<Integer> list) {
        if (count == target) {
            StringBuilder sb = new StringBuilder();
            for (int k : list) {
                sb.append(k).append(" ");
            }
            System.out.println(sb.toString().trim());
            return;
        }

        int start = list.isEmpty() ? 1 : list.get(list.size() - 1) + 1;
        for (int i = start; i <= N; i++) {
            List<Integer> newList = new ArrayList<>(list);
            newList.add(i);
            dfs(count + 1, target, newList);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        dfs(0, M, new ArrayList<>());
    }
}
