import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new LinkedList<>();
        int count = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            Integer a = 0;
            StringTokenizer st = new StringTokenizer(bf.readLine());
            switch (st.nextToken()) {
                case "push":
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    a = dq.peekFirst() == null ? -1 : dq.peekFirst();
                    sb.append(a).append("\n");
                    if (a == -1) {
                        break;
                    }
                    dq.pollFirst();
                    break;
                case "size":
                    a = dq.size();
                    sb.append(a).append("\n");
                    break;
                case "empty":
                    a = dq.peekLast() == null ? 1 : 0;
                    sb.append(a).append("\n");
                    break;
                case "front":
                    a = dq.peekFirst() == null ? -1 : dq.peekFirst();
                    sb.append(a).append("\n");
                    break;
                case "back":
                    a = dq.peekLast() == null ? -1 : dq.peekLast();
                    sb.append(a).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}