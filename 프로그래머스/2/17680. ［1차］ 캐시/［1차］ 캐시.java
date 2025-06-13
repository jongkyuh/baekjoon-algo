import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int time = 0;
        if(cacheSize ==  0) return cities.length * 5;
        List<String> list = new LinkedList<>();
        for(String s : cities){
            s = s.toUpperCase();
            if(list.contains(s)){ // 있으면
                time += 1;
                list.remove(s);
                list.add(s);
            }else{      //없을 떄 
                if(list.size() < cacheSize){    // 캐시에 바로 넣을 수 있ㅇ들 떄 
                    time += 5;
                    list.add(s);
                    
                }else{
                    list.remove(0);
                    list.add(s);
                    time += 5;
                }
            }
        }
        return time;
    }
}