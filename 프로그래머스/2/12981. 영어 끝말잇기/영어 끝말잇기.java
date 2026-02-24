import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        char lastChar = words[0].charAt(words[0].length() - 1);
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        
        for(int i =1; i < words.length; i++){
            String now = words[i];
            if(now.charAt(0) != lastChar || set.contains(now)){
                int a = i / n + 1;
                int b = i % n + 1;
                int[] result = new int[2];
                result[0] = b;
                result[1] = a;
                return result;
            }
            lastChar = now.charAt(now.length()-1);
            set.add(now);  // 🔥 이게 빠져있었음
        }

        

        return new int[]{0,0};
    }
}