import java.util.*;

public class Main{
    static StringBuilder sb = new StringBuilder();
    static void find(int[] cards, int findNum){
        int left = 0;     // 인덱스 
        int right = cards.length - 1;    // 인덱스
        
        
        while(left <= right){
            int mid = (left + right) / 2;
            
        if (cards[mid] == findNum) {
            sb.append(1 + " ");
            return;
        }

        if (cards[mid] > findNum) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
        }
        sb.append(0 + " ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] cards = new int[N];
        
        for(int i = 0; i < N; i++){
            cards[i] = sc.nextInt();            
        }
        
        Arrays.sort(cards);
        int K = sc.nextInt();
        
        for(int i = 0; i < K; i++){
            find(cards, sc.nextInt());
        }
        
        System.out.println(sb.toString().trim());
        
    }
}