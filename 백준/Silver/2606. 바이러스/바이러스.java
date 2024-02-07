import java.util.Scanner;

public class Main{
    public static int n;
    public static int m;
    static int[][] map = new int[101][101];
    static int[] visit = new int[101];
    static int count = 0;
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        sc.nextLine();
        
        for(int i = 0;i<m;i++){
            String st = sc.nextLine();
            String[] sp = st.split(" ");
            int a = Integer.parseInt(sp[0]);
            int b = Integer.parseInt(sp[1]);
            map[a][b] = map[b][a] = 1;           
        }
        dfs(1);
        System.out.println(count);
    }
    static void dfs(int start){
        visit[start] = 1;
        for(int i = 1;i<n+1;i++){
            if(map[start][i] == 1 && visit[i] == 0){
                count++;
                dfs(i);
            }
        }
    }
}