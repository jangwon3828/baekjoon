import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        for (int i = 1; i <= n; i++) {
            Integer poll = queue.poll();
            sb.append(poll + " ");
            queue.add(queue.poll());
        }
        System.out.println(sb);
    }
}

