class Solution {
    static boolean[] isvisited;
    static int max;
    
    public void dfs(int pirodo, int count, int[][] dungeons){
         for(int i = 0; i < dungeons.length; i++){
             int limitPirodo = dungeons[i][0];
             int somoPirodo = dungeons[i][1];
            if(!isvisited[i] && pirodo >= limitPirodo){
                isvisited[i] = true;
                dfs(pirodo - somoPirodo, count + 1, dungeons);
                isvisited[i] = false;
                
            }
        }
        max = Math.max(max, count);
    }
    public int solution(int k, int[][] dungeons) {
        //int answer = -1;
        isvisited = new boolean[dungeons.length];
        dfs(k, 0, dungeons);
        
        return max;
    }
}