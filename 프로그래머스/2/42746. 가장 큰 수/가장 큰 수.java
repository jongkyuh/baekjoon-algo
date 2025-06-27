import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strArr = new String[numbers.length];
        for(int i = 0; i < strArr.length; i++){
            strArr[i] = numbers[i] + "";
        }
        
        Arrays.sort(strArr, (o1, o2) -> {
           return (o2+o1).compareTo(o1+o2); 
        });
        
        if(strArr[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for(String s : strArr){
            sb.append(s);
        }
        return sb.toString();
    }
}