class Solution {
    static int answer = Integer.MAX_VALUE; 
    // 한글자만 달라지는지 확인하기 
    static boolean canTrans(String before, String after){
        int count = 0;
        for(int i = 0; i < before.length(); i++){
            if(before.charAt(i) != after.charAt(i)){
                count++;
            }
            if(count > 1){
                return false;
            }
            
        }
        return count == 1;
    }

    static void dfs(String[] words, String current, int count, String target, boolean[] visit){
        // 찾았을 때
        if(current.equals(target)){
            answer = Math.min(answer, count);
            return ;
        }
        // 못찾았을 때(방문안하고, 한 글자만 변경된것만 가능)
        for(int i = 0; i < words.length; i++){
            if(!visit[i] && canTrans(current, words[i])){
                visit[i] = true;
                dfs(words, words[i], count + 1, target, visit);
                visit[i] = false;
            }
        }
        
    }
    
    
    public int solution(String begin, String target, String[] words) {
        
        boolean exists = false;
        for(String s : words){
            if(target.equals(s)){
                exists = true;
                break;
            }
        }
        if(!exists) return 0;
        // 방문배열
        boolean[] visit = new boolean[words.length];
        dfs(words, begin, 0, target, visit);
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
}