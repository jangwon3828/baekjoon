import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt() * sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(sc.nextInt() - a).append(" ");
        }
        System.out.println(sb);
    }
}
