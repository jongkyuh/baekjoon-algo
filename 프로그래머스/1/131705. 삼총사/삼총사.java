class Solution {
    static int sum = 0; 
    static boolean[] isVisit;
    static void dfs(int start, int count, int num, int[] number){
        if(count == 3){
            if(0 == num){
                sum++;                
            }
            return;
        }else{
            for(int i = start; i < number.length; i++){
                dfs(i+1, count + 1, num + number[i], number);
            }
        }
        
        
    }
    public int solution(int[] number) {
        int answer = 0;
        int target = 0;
        isVisit = new boolean[number.length];
        dfs(0, 0, 0, number);
        return sum;
    }
}