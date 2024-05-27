import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String,Integer> hashMap = new HashMap<>();    // 책제목과 수량을 저장할 해시맵
        for(int i = 0; i < n;i++){
            String s = sc.nextLine();
            hashMap.put(s,hashMap.getOrDefault(s,0) + 1);
        }
        
        ArrayList<Integer> arrList = new ArrayList<>(hashMap.values());
        int max = Collections.max(arrList);
        
        ArrayList<String> strList = new ArrayList<>();
        for(String s : hashMap.keySet()){
            if(hashMap.get(s) == max){
                strList.add(s);
            }
        }
        
        Collections.sort(strList);
        
        System.out.println(strList.get(0));
               
        
    }
}