import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "@";
        String empty = " ";
        String repeat = s.repeat(n * 3) + empty.repeat(n) + s.repeat(n);
        String repeat2 = s.repeat(n) + empty.repeat(n) + s.repeat(n) + empty.repeat(n) + s.repeat(n);
        String repeat3 = s.repeat(n) + empty.repeat(n) + s.repeat(n * 3);
        String first = "";
        String second = "";
        String third = "";

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                first = first + repeat;
            } else first = first + repeat + "\n";
        }
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                second = second + repeat2;
            } else
                second = second + repeat2 + "\n";
        }
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                third = third + repeat3;
            } else
                third = third + repeat3 + "\n";
        }
        StringBuilder sb = new StringBuilder();

        sb.append(first).append("\n");
        for (int i = 0; i < 3; i++) {
            sb.append(second).append("\n");
        }
        sb.append(third).append("\n");


        System.out.println(sb);
    }
}