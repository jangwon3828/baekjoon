import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        String s="@";
        String repeat = s.repeat(n);
        String first=repeat;
        String second=repeat;

        for (int i = 0; i < 4; i++) {
            first=first+repeat;
        }
        for (int i = 0; i < n-1; i++) {
            second=second+"\n"+repeat;
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(second).append("\n");
        }
        for (int i = 0; i < n; i++) {
            sb.append(first).append("\n");
        }

        System.out.println(sb);
    }
}