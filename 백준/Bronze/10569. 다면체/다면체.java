import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < n; i++) {
            int dot = sc.nextInt();
            int angle = sc.nextInt();
            sb.append(angle-dot+2).append("\n");
        }
        System.out.println(sb);
    }
}