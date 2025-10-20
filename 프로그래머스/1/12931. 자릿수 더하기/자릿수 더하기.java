import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        int len = Integer.toString(n).length();
        int g = 1;
        for(int i = 0; i < len - 1; i++){
            g = g * 10;
        }
        
        for(int i = 0;i < len; i++){
            answer = answer + (n / g);
            n = n % g;
            g = g / 10;
        }

        return answer;
    }
}