import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int stime = fees[0]; // 기본 시간
        int sfee = fees[1];  // 기본 요금
        int ptime = fees[2]; // 단위 시간
        int pfee = fees[3];  // 단위 요금

        Map<String, Integer> resultCountMap = new HashMap<>();
        Map<String, String> implMap = new HashMap<>();

        for (String record : records) {
            String[] s = record.split(" ");
            String time = s[0];
            String car = s[1];
            String type = s[2];

            if (type.equals("IN")) {
                implMap.put(car, time);
            } else { // OUT
                String inTime = implMap.get(car);
                int start = convertToMinute(inTime);
                int end = convertToMinute(time);
                resultCountMap.put(car, resultCountMap.getOrDefault(car, 0) + (end - start));
                implMap.remove(car);
            }
        }

        // 출차 기록 없는 차 처리 (23:59 출차로 간주)
        for (String car : implMap.keySet()) {
            String inTime = implMap.get(car);
            int start = convertToMinute(inTime);
            int end = convertToMinute("23:59");
            resultCountMap.put(car, resultCountMap.getOrDefault(car, 0) + (end - start));
        }

        // 차량번호 오름차순 정렬
        List<String> carList = new ArrayList<>(resultCountMap.keySet());
        Collections.sort(carList);

        List<Integer> resultList = new ArrayList<>();
        for (String car : carList) {
            int totalTime = resultCountMap.get(car);
            if (totalTime <= stime) {
                resultList.add(sfee);
            } else {
                int extraTime = totalTime - stime;
                int extraUnit = (int) Math.ceil((double) extraTime / ptime);
                resultList.add(sfee + (extraUnit * pfee));
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    private int convertToMinute(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }
}
