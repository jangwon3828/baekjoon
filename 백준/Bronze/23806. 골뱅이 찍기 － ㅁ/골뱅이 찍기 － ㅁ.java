import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "@";
        String empty = " ";
        String repeat = s.repeat(n * 5);
        String repeat2 = s.repeat(n) + empty.repeat(n*3) + s.repeat(n);
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

        StringBuilder sb = new StringBuilder();

        sb.append(first).append("\n");
        for (int i = 0; i < 3; i++) {
            sb.append(second).append("\n");
        }
        sb.append(first).append("\n");


        System.out.println(sb);
    }
}