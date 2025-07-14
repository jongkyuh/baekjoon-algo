import java.util.*;

public class Main{
    
    static class Node{
        int x;
        int y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Node[] arr = new Node[n];
        for(int i = 0; i < n; i++){
            String[] str = sc.nextLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            arr[i] = new Node(x,y);
        }
        
        Arrays.sort(arr, (n1, n2) -> {
             if(n1.x == n2.x){
                 return n1.y - n2.y;
             } 
            return n1.x - n2.x;
        });
        
        for(Node getNode : arr){
            System.out.println(getNode.x + " " + getNode.y);
        }
        
    }
}