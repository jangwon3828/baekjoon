import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        int n = sc.nextInt();
        String s = "@";
        String empty = " ";
        String repeat2 = s.repeat(n);
        String repeat = s.repeat(n*5);
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
        sb.append(first).append("\n");
        sb.append(second).append("\n");
        sb.append(first).append("\n");
        sb.append(second).append("\n");
        sb.append(second).append("\n");

        System.out.println(sb);
    }
}