import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        
        String str = br.readLine();
        String[] str2 = str.split(" ");
        
        // 첫줄 정수형 받기
        int a = Integer.parseInt(str2[0]);
        int b = Integer.parseInt(str2[1]);
        
        int namuge1 = a;
        int namuge2 = b;
        
        // 각 줄 해시셋으로 받기
        HashSet<Integer> hash1 = new HashSet<>();
        HashSet<Integer> hash2 = new HashSet<>();
        
        String[] strHash1 = br.readLine().split(" ");
        String[] strHash2 = br.readLine().split(" ");
        
        for(int i = 0;i<a;i++){
            hash1.add(Integer.parseInt(strHash1[i]));
        }
        
        for(int i = 0;i<b;i++){
            hash2.add(Integer.parseInt(strHash2[i]));
        }       
                   
        
        
        // 먼저 A집합에서 B집할 뺄 때 
        for(int s : hash2){
            if(hash1.contains(s)){
                --namuge1;
            }
        }
        
        for(int s : hash1){
            if(hash2.contains(s)){
                --namuge2;
            }
        }
        
        System.out.println(namuge1+namuge2);
        
    }
}