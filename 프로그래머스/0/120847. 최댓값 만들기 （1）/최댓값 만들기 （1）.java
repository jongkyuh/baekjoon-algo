import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        numbers = Arrays.stream(numbers).boxed().sorted((c1,c2) -> {
            return c2- c1;
        }).mapToInt(Integer::intValue).toArray();
        return numbers[0] * numbers[1];
    }
}