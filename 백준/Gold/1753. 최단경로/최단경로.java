import java.util.*;

public class Main{
    static class Node{
        int end;
        int cost;
        
        public Node(int end, int cost){
            this.end = end;
            this.cost = cost;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        
        int n = Integer.parseInt(str[0]);
        int e = Integer.parseInt(str[1]);
        
        int start = Integer.parseInt(sc.nextLine());
        List<List<Node>> list = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < e; i++){
            String[] str2 = sc.nextLine().split(" ");
            int n1 = Integer.parseInt(str2[0]);
            int n2 = Integer.parseInt(str2[1]);
            int nc = Integer.parseInt(str2[2]);
            list.get(n1).add(new Node(n2,nc));
        }
        
        
        int[] distance = new int[n+1];
        for(int i = 0; i <= n; i++){
            distance[i] = 1000000;
        }
        
        PriorityQueue<Node> pq = new PriorityQueue<>((n1,n2) -> n1.cost - n2.cost);
       
        pq.add(new Node(start,0));
        distance[start] = 0;
        
        while(!pq.isEmpty()){
            Node pollNode = pq.poll();
            int endV = pollNode.end;
            int costs = pollNode.cost;
            
            if(distance[endV] < costs) continue;
            
            for(Node getNode : list.get(endV)){
                int nextV = getNode.end;
                int nextCost = getNode.cost;
                if(distance[endV] + nextCost < distance[nextV]){
                    distance[nextV] = distance[endV] + nextCost;
                    pq.add(new Node(nextV, distance[nextV]));
                }
            }
        }
        for(int i = 1; i <= n; i++){
            if(distance[i] < 1000000){
                System.out.println(distance[i]);
            }else{
                System.out.println("INF");
            }
               
        }
    }
}