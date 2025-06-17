class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(); // 결과를 저장할 StringBuilder
        
        int idx = 0; 
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                idx = 0;
                sb.append(" ");
                continue;
            }else{
                if(idx % 2 == 0){   // 짝수
                    sb.append(Character.toUpperCase(s.charAt(i)));
                    idx++;
                }else{
                    sb.append(Character.toLowerCase(s.charAt(i)));
                    idx++;
                }
            }
            
        }
        return sb.toString();
    }
}
