import java.util.*;

class Solution {
    static char[] cChar;
    static List<String> strList;
    static void find(String s, boolean[] visit){
        if(s.length() == cChar.length) return;
        
        for(int i = 0; i < cChar.length; i++){
            if(!visit[i]){
                String newStr = s + cChar[i];
                strList.add(newStr);
                visit[i] = true;
                find(newStr, visit);
                visit[i] = false;
            }
        }
    }
    public int solution(String numbers) {
        int answer = 0;
        cChar = numbers.toCharArray(); // 글자배열로 변경 
        strList = new ArrayList<>();
        boolean[] visit = new boolean[cChar.length];
        find("", visit);
        
        Set<Integer> set =new HashSet<>();
        for(String s : strList){
            set.add(Integer.parseInt(s));
        }
        List<Integer> intList = new ArrayList<>(set);
        for(int n : intList){
            boolean change = true;
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    change = false;
                    break;
                }
            }
            if(n > 1 && change){
                answer++;
            }
        }
        return answer;
    }
}