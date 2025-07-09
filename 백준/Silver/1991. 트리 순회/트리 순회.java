import java.util.*;
import java.io.*;

public class Main{
    static class Node{
        int left = -1;
        int right = -1;
    }
    static Node[] nodes;
    static void preOrder(int k){
        if(k == -1) return;
        System.out.print((char)(k+'A'));
        preOrder(nodes[k].left);
        preOrder(nodes[k].right);
    }
    static void inOrder(int k){
        if(k == -1) return;        
        inOrder(nodes[k].left);
        System.out.print((char)(k+'A'));
        inOrder(nodes[k].right);
    }
    static void postOrder(int k){
        if(k == -1) return;        
        postOrder(nodes[k].left);
        postOrder(nodes[k].right);
        System.out.print((char)(k+'A'));
    }
    
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());    // 노드갯수, 라인 수 
        nodes = new Node[26];
        for(int i = 0; i < 26; i++){
            nodes[i] = new Node();
        }
        
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            char p = st.nextToken().charAt(0);
            char l = st.nextToken().charAt(0);
            char r = st.nextToken().charAt(0);
            // 자식노드 
            if(l != '.') nodes[p - 'A'].left = l - 'A';
            if(r != '.') nodes[p - 'A'].right = r - 'A';
        }
        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);
        
           
    }
}