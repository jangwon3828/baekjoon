import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            String next = sc.next();
            boolean check = true;
            for (int j = 0; j < next.length(); j++) {

                char c = next.charAt(j);

                if (c == '(') {
                    stack.push(c);
                }
                if (c == ')') {
                    if (stack.size() == 0) {
                        check = false;
                        sb.append("NO").append("\n");
                        break;
                    }
                    stack.pop();
                }
                if (j == next.length() - 1) {
                    check = stack.isEmpty();

                    if (!check) sb.append("NO").append("\n");
                }

            }
            if (check) {
                sb.append("YES").append("\n");
            }
        }
        System.out.println(sb);
    }
}
