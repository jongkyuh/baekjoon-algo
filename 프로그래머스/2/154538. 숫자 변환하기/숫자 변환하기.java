import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        Queue<int[]> q = new ArrayDeque<>();
        
        q.add(new int[]{x,0}); // 현재숫자, 연산횟수
        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        while(!q.isEmpty()){
            int[] get = q.poll();
            int num = get[0];
            int count = get[1];
            
            if(num == y) return count;
            int[] sumArr = new int[]{num + n, num * 2, num * 3};
            
            for(int sumNum : sumArr){
                if(sumNum <= y && !set.contains(sumNum)){
                    set.add(sumNum);
                    q.add(new int[]{sumNum,count+1});
                }
            }
        }
        return -1;
    }
}