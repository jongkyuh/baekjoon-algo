import java.util.*;


class Solution {
    public String[] solution(String[] record) {
        List<String> result = new ArrayList<>();
        Map<String, String> content = new HashMap<>();
        content.put("Enter", "님이 들어왔습니다.");
        content.put("Leave", "님이 나갔습니다.");
        
        Map<String, String> uid = new HashMap<>();
        
        
        for(String s : record){
            String[] stringSplit = s.split(" ");
            if(stringSplit[0].equals("Enter") || stringSplit[0].equals("Change")){
                uid.put(stringSplit[1], stringSplit[2]);
            }
        }
        for(String s : record){
            String[] arr = s.split(" "); 
            if(arr[0].equals("Change")) continue;
            if(arr[0].equals("Enter")){
                result.add(uid.get(arr[1]) + content.get("Enter"));
            }else{
                result.add(uid.get(arr[1]) + content.get("Leave"));
            }
        }
        return result.toArray(new String[0]);
    }
}