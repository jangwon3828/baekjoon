import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        int temp = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            int num = Integer.parseInt(bf.readLine());
            for (int x = temp; x <= num; x++) {
                stack.push(x);
                sb.append("+").append("\n");
                temp++;
            }
            if (num == stack.peek()) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                StringBuilder st = new StringBuilder();
                st.append("NO");
                System.out.println(st);
                System.exit(0);
            }
        }

        System.out.println(sb);

    }
}