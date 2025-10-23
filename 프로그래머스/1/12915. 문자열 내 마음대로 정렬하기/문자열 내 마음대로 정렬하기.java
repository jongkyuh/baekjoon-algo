import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {     
        
        List<String> list = new ArrayList<>();
        for(String s : strings) list.add(s);
        
        list.sort((a,b) -> {
           if(a.charAt(n) == b.charAt(n)) return a.compareTo(b);
            return a.charAt(n) - b.charAt(n);
        });
        return list.toArray(new String[0]);
    }
}