import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {
            sb.append(solve(s.next(), s.next())).append("\n");
        }
        System.out.print(sb);
    }
    public static String solve(String a, String b) {
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                return "ERROR";
            }
        }
        return "OK";
    }
}