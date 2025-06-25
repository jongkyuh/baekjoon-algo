import java.util.*;

public class Main{
    static int[][] point;
    static int N;
    static boolean[] jo;
    static int min = Integer.MAX_VALUE;
    
    static void calculate(){
        int fTeam = 0;
        int sTeam = 0;
        
        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                if(jo[i] && jo[j]){
                    fTeam += point[i][j] + point[j][i];
                }else if(!jo[i] && !jo[j]){
                    sTeam +=  point[i][j] + point[j][i];
                }
            }
        }
        int diff = Math.abs(fTeam - sTeam);
        min = Math.min(min, diff);
    }
    static void makeJo(int count, int idx){
        if(count == N / 2){
            calculate();
            return;
        }
        
        for(int i = idx; i < N; i++){
            if(!jo[i]){
                jo[i] = true;
                makeJo(count + 1, i + 1);
                jo[i] = false;
            }           
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();    // 인원 수 
        sc.nextLine();
        point = new int[N][N];
        jo = new boolean[N];
        
         // point 배열 초기화 
        for(int i = 0; i < N; i++){   
            String[] str = sc.nextLine().split(" ");
            for(int j = 0; j < str.length; j++){
                point[i][j] = Integer.parseInt(str[j]);
            }
        }
        makeJo(0,0);
        System.out.println(min);
        
        
    }
}