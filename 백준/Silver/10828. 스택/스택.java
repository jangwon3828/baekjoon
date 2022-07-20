import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(bf.readLine());
        int b = 0;
        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String str = st.nextToken();
            if (str.equals("push")) {
                b = Integer.parseInt(st.nextToken());
            }
            switch (str) {
                case "push":
                    stack.push(b);
                    break;
                case "top":
                    if (stack.size() == 0) {
                        sb.append(-1).append("\n");
                        break;
                    }
                    sb.append(stack.peek()).append("\n");
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "pop":
                    if (stack.size() == 0) {
                        sb.append(-1).append("\n");
                        break;
                    }
                    sb.append(stack.pop()).append("\n");
                    break;
                case "empty":
                    sb.append(stack.empty() ? 1 : 0).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}