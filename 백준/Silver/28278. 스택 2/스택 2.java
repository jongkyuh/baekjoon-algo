import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] parts = str.split(" ");

            if (parts[0].equals("1")) { // Push operation
                int value = Integer.parseInt(parts[1]);
                stack.push(value);
            } else if (parts[0].equals("2")) { // Pop operation
                if (stack.isEmpty()) {
                    wr.write("-1\n");
                } else {
                    wr.write(stack.pop() + "\n");
                }
            } else if (parts[0].equals("3")) { // Size operation
                wr.write(stack.size() + "\n");
            } else if (parts[0].equals("4")) { // IsEmpty operation
                wr.write((stack.isEmpty() ? 1 : 0) + "\n");
            } else if (parts[0].equals("5")) { // Top operation
                if (stack.isEmpty()) {
                    wr.write("-1\n");
                } else {
                    wr.write(stack.peek() + "\n");
                }
            }
        }

        wr.flush();
        wr.close();
        br.close();
    }
}
