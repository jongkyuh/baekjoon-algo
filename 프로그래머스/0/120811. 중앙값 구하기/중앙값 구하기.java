import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        if(array.length == 1) return array[0];
        int n = array.length / 2;
        return array[n];
    }
}