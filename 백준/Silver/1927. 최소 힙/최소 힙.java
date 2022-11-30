import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> tree = new PriorityQueue<>();
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            if (n == 0 && tree.isEmpty()) {
                sb.append(0).append("\n");
            } else if (n == 0) {
                Integer first = tree.poll();
                sb.append(first).append("\n");
            } else {
                tree.add(n);
            }
        }
        System.out.println(sb);
    }
}