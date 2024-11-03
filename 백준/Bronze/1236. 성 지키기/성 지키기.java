import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        char[][] castle = new char[n][m];
        for(int i = 0; i < n;i++){
            castle[i] = sc.next().toCharArray();
        }

        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(castle[i][j] == 'X'){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        int x = 0;
        int y = 0;
        for(boolean b : row){
            if(!b) x++;
        }
        for(boolean b : col){
            if(!b) y++;
        }

        

        System.out.println(Math.max(x,y));
    }
}