import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

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
                case "push_front":
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(dq.size()==0?-1:dq.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    sb.append(dq.size()==0?-1:dq.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append((Integer) dq.size()).append("\n");
                    break;
                case "empty":
                    a = dq.peekLast() == null ? 1 : 0;
                    sb.append(a).append("\n");
                    break;
                case "front":
                    sb.append(dq.size() == 0 ? -1 : dq.peekFirst()).append("\n");

                    break;
                case "back":
                    sb.append(dq.size() == 0 ? -1 : dq.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
