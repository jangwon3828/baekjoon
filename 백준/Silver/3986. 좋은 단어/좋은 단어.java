import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            String next = sc.next();
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < next.length(); j++) {
                char c = next.charAt(j);
                if (stack.size() == 0) {
                    stack.push(c);
                    continue;
                }
                if (stack.peek() == 'A' && c == 'A') {
                    stack.pop();

                    continue;
                }
                if (stack.peek() == 'B' && c == 'B') {
                    stack.pop();

                    continue;
                } else {
                    stack.push(c);

                }
            }
            if (stack.size() == 0) answer++;
        }
        System.out.println(answer);
    }
}