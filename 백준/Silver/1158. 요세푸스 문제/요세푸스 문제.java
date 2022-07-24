import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        Deque<Integer> dq = new LinkedList<>();
        int b = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for (int x = 1; x <= a; x++) {
            dq.add(x);
        }
        sb.append("<");
        for (int i = 0; i < a-1; i++) {
            for (int y = 0; y < b - 1; y++) {
                int te = dq.peekFirst();
                dq.pollFirst();
                dq.addLast(te);
            }

            int out = dq.pollFirst();
            sb.append(out).append(", ");
        }
        int out = dq.pollFirst();
        sb.append(out).append(">");
        System.out.print(sb);
    }
}