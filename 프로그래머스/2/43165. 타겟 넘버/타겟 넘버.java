class Solution {
    static int sum = 0;
    static void dfs(int target, int targetLen, int count, int[] numbers, int num){
        if(targetLen == count){
            if(target == num){
                sum++;                
            }
            return;
        }
        
            dfs(target, targetLen, count + 1, numbers, num + (numbers[count] * -1));
            dfs(target, targetLen, count + 1, numbers, num + (numbers[count] * 1));
        
        
        
    }
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
      //  int[] hubo = new int[]{-1,1};
        dfs(target, numbers.length, 0, numbers, 0);
        return sum;
    }
}