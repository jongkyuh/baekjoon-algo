import java.util.*;

public class Main{
    
    static class Node{
        int prior;
        int idx;
        
        public Node(int p, int i){
            this.prior = p;
            this.idx = i;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < k;i++){
            int count = 0;    // 출력횟수
            int max = 0;        // 현재 우선순위 최고값
            String[] str1 = sc.nextLine().split(" ");
            
            int n = Integer.parseInt(str1[0]);            // 입력될 노드갯수 
            int target = Integer.parseInt(str1[1]);    // 출력되어야할 인덱스값
            
            String[] str2 = sc.nextLine().split(" ");
            
            Node[] arr = new Node[n];
            Deque<Node> q = new ArrayDeque<>();
            for(int j = 0; j < n; j++){
                arr[j] = new Node(Integer.parseInt(str2[j]), j);    // arr값 추가 
                q.addLast(arr[j]);
            }
            
            
            while(true){
                boolean printable = true;
                Node currentNode = q.pollFirst();
                
                // 현재 꺼낸값이 프린트 할 수 있는상태인지 확인
                for(Node getNode : q){
                    if(getNode.prior > currentNode.prior){
                        printable = false;
                        break;
                    }
                }
                
                if(!printable){
                    q.addLast(currentNode);
                }else{
                    count++;
                    if(currentNode.idx == target){
                        System.out.println(count);
                        break;
                    }
                }
            }
            
        }
        
    }
}