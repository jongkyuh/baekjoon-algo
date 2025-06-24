import java.util.*;

public class Main{
    static int[] arr;    // 피연산자배열
    static int max;
    static int min;
    
    static void dfs(int count,int target, int sum, int[] oper){
        if(count == target){
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }
        
        for(int i = 0; i < 4; i++){
            if(oper[i] != 0){
                oper[i]--;
                if(i == 0){    // 1. 더하기
                    dfs(count + 1, target, sum + arr[count + 1], oper);                   
                }else if(i == 1){
                    dfs(count + 1, target, sum - arr[count + 1], oper); 
                }else if(i == 2){        // 3. 곱하기
                    dfs(count + 1, target, sum * arr[count + 1], oper);
                }else{                // 4. 나누기
                    dfs(count + 1, target, sum / arr[count + 1], oper);
                }
                oper[i]++;
            }
        }
        return;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        
        int n = sc.nextInt();        
        sc.nextLine();
        
        String[] str = sc.nextLine().split(" ");
        
        arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        
        int[] oper = new int[4];    // 연산자배열
        str = sc.nextLine().split(" ");
        
        for(int i = 0; i < 4; i++){
            int m = Integer.parseInt(str[i]);
            oper[i] = m;
        }
        
        dfs(0, n-1, arr[0], oper);
        
        
        System.out.println(max);
        System.out.println(min);
        
        
        
        
        
        
    }
}