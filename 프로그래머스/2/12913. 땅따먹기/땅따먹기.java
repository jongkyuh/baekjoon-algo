import java.util.*;

class Solution {
    
    static int max;
    // 완전탐색방법 dp x
    static void check(int count, int preNum, int[][] land, int sum){
        if(count == land.length){
            max = Math.max(max, sum);
            return;
        }
        for(int i = 0; i < land[0].length; i++){
            if(i != preNum){                
                check(count + 1, i, land, sum + land[count][i]);
            }
            
        }
    }
    int solution(int[][] land) {
        int answer = 0;
        max = 0;
        // check(0, 5, land, 0); 
        
        int n = land.length;    // 총 행의 갯수 
        for(int i = 1; i < n; i++){   // dp방식                
            for(int j = 0; j < 4; j++){
                int maxPre = 0;
                for(int k = 0; k < 4; k++){
                    if(k != j){
                        maxPre = Math.max(maxPre, land[i-1][k]);
                    }
                }
                land[i][j] += maxPre;
            }
        }
        
        int result = 0;
        for(int p : land[n-1]){
            result = Math.max(result, p);
        }
        

        return result;
    }
}