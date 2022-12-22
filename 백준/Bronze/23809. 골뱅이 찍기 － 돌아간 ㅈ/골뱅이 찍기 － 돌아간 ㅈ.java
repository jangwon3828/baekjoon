import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        int n = sc.nextInt();
        String s = "@";
        String empty = " ";
        String repeat3 = s.repeat(n * 3);
        String repeat2 = s.repeat(n) + empty.repeat(n*2) + s.repeat(n);
        String repeat = s.repeat(n) + empty.repeat(n*3) + s.repeat(n);
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
        sb.append(first).append("\n");
        sb.append(second).append("\n");
        sb.append(third).append("\n");
        sb.append(second).append("\n");
        sb.append(first).append("\n");

        System.out.println(sb);
    }
}