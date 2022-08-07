import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append("Gnomes:").append("\n");
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (b > c) {
                if (c > d) {
                    sb.append("Ordered").append("\n");
                    continue;
                }
            }
            if (b < c) {
                if (c < d) {
                    sb.append("Ordered").append("\n");
                    continue;
                }
            }
            sb.append("Unordered").append("\n");
        }
        System.out.println(sb);

    }
}
