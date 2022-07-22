import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new LinkedList<>();
        int count = Integer.parseInt(bf.readLine());
        for (int i = 1; i <= count; i++) {
            dq.addFirst(i);
        }
        while (true) {
            if (dq.size() == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(dq.peekLast());
                System.out.println(sb);
                System.exit(0);
            }
            dq.pollLast();
            int temp = dq.peekLast();
            dq.pollLast();
            dq.addFirst(temp);
        }
    }
}