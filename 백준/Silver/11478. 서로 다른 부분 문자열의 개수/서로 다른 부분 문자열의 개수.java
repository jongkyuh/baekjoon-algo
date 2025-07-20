import java.util.*;

public class Main{
    static String s;
    static Set<String> set;
    static void find(String currentS, int idx){ // idx는 추가한 마지막 문자의 인덱스
        if(idx == s.length() - 1) return;
        for(int i = idx+1; i < s.length(); i++){
            String nextStr = currentS + s.charAt(i);
            set.add(nextStr);
            find(nextStr, i);            
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();    // 주어진 문자열
        set = new HashSet<>();    // 중복을 거를 set 
        // find("",-1);
        for(int i = 0; i < s.length(); i++){
            for(int j = i +1; j <= s.length(); j++){
                set.add(s.substring(i,j));
            }
        }
        System.out.println(set.size());
        
        
    }
}