class Solution {
    static int result = 0;
    
    static void dfs(int num, int count, int[] numbers, int target){
        if(count == numbers.length){
            if(num == target){
                result++;
            }
            return;
        }
        
        dfs(num + (numbers[count] * 1),count + 1, numbers, target);
        dfs(num + (numbers[count] * -1),count + 1, numbers, target);
    }
    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(0, 0, numbers, target);
        return result;
    }
}