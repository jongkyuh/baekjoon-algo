import java.util.*;

public class Main {
    static class Node {
        String n;
        long gop;
        public Node(String n, long gop) {
            this.n = n;
            this.gop = gop;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Map<String, Node> map = new HashMap<>();
        
        map.put("black", new Node("0", 1L));
        map.put("brown", new Node("1", 10L));
        map.put("red", new Node("2", 100L));
        map.put("orange", new Node("3", 1000L));
        map.put("yellow", new Node("4", 10000L));
        map.put("green", new Node("5", 100000L));
        map.put("blue", new Node("6", 1000000L));
        map.put("violet", new Node("7", 10000000L));
        map.put("grey", new Node("8", 100000000L));
        map.put("white", new Node("9", 1000000000L));

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        
        long a = Long.parseLong(map.get(s1).n + map.get(s2).n);
        System.out.println(a * map.get(s3).gop);
    }
}
