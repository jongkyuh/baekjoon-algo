import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(); // 정답 문자열
        StringBuilder impl = new StringBuilder();
        Map<String,Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);   // 해당 단어
            if(c - '0' >= 0 && c - '0'<= 9){    // 1. 숫자일 때 
                sb.append(c);
                continue;
            }
            
            impl.append(c);
            if(map.containsKey(impl.toString())){
                // 2. 문자열이 숫자로 변환이 된다면
                sb.append(map.get(impl.toString()));
                impl = new StringBuilder();
            }else{
                continue;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}