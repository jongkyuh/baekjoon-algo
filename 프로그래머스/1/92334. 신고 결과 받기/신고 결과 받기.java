import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        int[] answer = new int[id_list.length];

        // 1. id → index 매핑
        Map<String, Integer> idMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            idMap.put(id_list[i], i);
        }

        // 2. 중복 신고 제거
        Set<String> reportSet = new HashSet<>();
        for (String r : report) {
            reportSet.add(r);
        }

        // 3. 신고당한 사람 → 신고자 목록
        Map<String, List<String>> singoMap = new HashMap<>();

        // 4. 신고 받은 횟수
        Map<String, Integer> countMap = new HashMap<>();

        // 5. 신고 처리
        for (String r : reportSet) {
            String[] temp = r.split(" ");
            String from = temp[0];
            String to = temp[1];

            countMap.put(to, countMap.getOrDefault(to, 0) + 1);

            singoMap.computeIfAbsent(to, key -> new ArrayList<>()).add(from);
        }

        // 6. 정지된 유저 처리
        for (String user : countMap.keySet()) {
            if (countMap.get(user) >= k) {

                for (String reporter : singoMap.get(user)) {
                    answer[idMap.get(reporter)]++;
                }
            }
        }

        return answer;
    }
}
