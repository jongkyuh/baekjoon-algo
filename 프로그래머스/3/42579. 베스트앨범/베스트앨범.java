import java.util.*;

class Solution {

    static class Song {
        int idx;
        int plays;

        public Song(int idx, int plays) {
            this.idx = idx;
            this.plays = plays;
        }
    }

    Map<String, Integer> countMap = new HashMap<>();
    Map<String, List<Song>> idxMap = new HashMap<>();

    public int[] solution(String[] genres, int[] plays) {

        List<Integer> result = new ArrayList<>();

        // 1단계: 장르별 총합 + 곡 리스트 저장
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            countMap.put(genre, countMap.getOrDefault(genre, 0) + play);
            idxMap.computeIfAbsent(genre, k -> new ArrayList<>())
                  .add(new Song(i, play));
        }

        // 2단계: 장르 정렬 (총 재생수 기준)
        List<String> genreOrder = new ArrayList<>(countMap.keySet());
        genreOrder.sort((a, b) -> countMap.get(b) - countMap.get(a));

        // 3단계: 각 장르별 노래 정렬
        for (String key : idxMap.keySet()) {
            List<Song> list = idxMap.get(key);

            list.sort((a, b) -> {
                if (a.plays == b.plays) {
                    return a.idx - b.idx; // idx 오름차순
                }
                return b.plays - a.plays; // plays 내림차순
            });
        }

        // 4단계: 장르별 상위 2곡 뽑기
        for (String genre : genreOrder) {
            List<Song> list = idxMap.get(genre);

            for (int i = 0; i < list.size() && i < 2; i++) {
                result.add(list.get(i).idx);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
