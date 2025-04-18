import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        // 8개의 정수 입력 받아서 map에 저장
        for (int i = 1; i <= 8; i++) {
            String s = sc.nextLine();
            map.put(i, Integer.parseInt(s));
        }
        
        // map을 List로 변환하여 값 기준으로 내림차순 정렬
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((l1, l2) -> Integer.compare(l2.getValue(), l1.getValue())); // 안전한 비교

        int sum = 0;
        List<Integer> list2 = new ArrayList<>();
        // 상위 5개의 값을 합산하고 키를 StringBuilder에 추가
        for (int i = 0; i < 5; i++) {
            sum += list.get(i).getValue();
           // sb.append(list.get(i).getKey()).append(" "); // 각 키를 공백으로 구분
            list2.add(list.get(i).getKey());
        }
        
        Collections.sort(list2);
        
        // 결과 출력
        System.out.println(sum);
        for(int a : list2){
            System.out.print(a + " ");
        }
    }
}
