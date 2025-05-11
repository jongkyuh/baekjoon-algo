import java.util.*;

public class Main{
    
    static class Node{
        int idx;    // 노드인덱스
        int cost;    // 가중치
        
        public Node(int idx, int cost){
            this.idx = idx;
            this.cost = cost;
        }     
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    // Scanner

        String[] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);    // 노드 수
        int m = Integer.parseInt(str[1]);    // 간선 수
        int start = Integer.parseInt(sc.nextLine());    // 시작 노드
        
        List<List<Node>> list = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            list.add(new ArrayList<>());
        }
        
        for(int i = 0; i < m; i++){
            String[] str2 = sc.nextLine().split(" ");
            int n1 = Integer.parseInt(str2[0]);    // 출발 인덱스
            int n2 = Integer.parseInt(str2[1]);    // 도착 인덱스
            int n3 = Integer.parseInt(str2[2]);    // 가중치
            
            list.get(n1).add(new Node(n2, n3));
        }
        
        int[] distance = new int[n+1];    // 시작 노드로 부터의 거리 배열  
        for(int i = 0; i < n+1; i++){
            distance[i] = 10000000;
        }
        
       // Deque<Node> q = new ArrayDeque<>();
        PriorityQueue<Node> q = new PriorityQueue<>((pq1, pq2) -> pq1.cost - pq2.cost);
        distance[start] = 0;    // 시작에서 시작지점은 거리가 0이다.
        q.add(new Node(start, 0));
        
        while(!q.isEmpty()){
            Node pollNode = q.poll();
            if(distance[pollNode.idx] < pollNode.cost) continue;
            
            for(int i = 0; i < list.get(pollNode.idx).size(); i++){
                Node newNode = list.get(pollNode.idx).get(i);
                if(distance[newNode.idx] > distance[pollNode.idx] + newNode.cost){
                    distance[newNode.idx]  = distance[pollNode.idx] + newNode.cost;
                    q.add(new Node(newNode.idx, distance[newNode.idx]));
                }
            }           
            
        }
        
        for(int i = 1; i < n+1; i++){
            if(distance[i] < 10000000){
                System.out.println(distance[i]);
            }else{
               System.out.println("INF"); 
            }
            
        }
        
           
        
    }
}