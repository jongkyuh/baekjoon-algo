import java.util.*;

class Solution {
    static int[] changeIntArr =  new int[4];
    static int check(int location){
        if(location >= changeIntArr[2] && location <= changeIntArr[3]){
           location = changeIntArr[3]; // 오프닝으로 이동 
        }
        return location;
    }
    static int next(int location){
        location = check(location);
        if(location > changeIntArr[0] - 10){
            location = changeIntArr[0];
        }else{
            location = location + 10;
        }
        location = check(location);
        return location;
    }
    static int prev(int location){
        location = check(location);
        if(location < 10){
            location = 0;
        }else{
            location = location - 10;
        }
        location = check(location);
        return location;
        
    }
    
    //
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";        
        String[] s = video_len.split(":");        
        changeIntArr[0] = Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
        
        s = pos.split(":");
        changeIntArr[1] = Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
        
        s = op_start.split(":");
        changeIntArr[2] = Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
        
        s = op_end.split(":");
        changeIntArr[3] = Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
        
        int start = changeIntArr[1];
        
        for(String com : commands){
            if(com.equals("prev")){
                start = prev(start);
            }else{
                start = next(start);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        if(start / 60 < 10){
            sb.append("0"+(start / 60) + ":");
        }else{
            sb.append((start / 60) + ":");
        }
    
        
        
        if(start % 60 < 10){
            sb.append("0" + (start % 60));
        }else{
            sb.append((start % 60) + "");
        }
        
        return sb.toString();
    }
}