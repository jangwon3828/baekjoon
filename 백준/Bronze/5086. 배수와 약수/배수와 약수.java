import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0) {
                System.out.println(sb);
                System.exit(0);
            }
            if (a > b) {
                if (a % b == 0) {
                    sb.append("multiple").append("\n");
                } else {
                    sb.append("neither").append("\n");
                }
            }
            if (a <= b) {
                if (b % a == 0) {
                    sb.append("factor").append("\n");
                } else {
                    sb.append("neither").append("\n");
                }

            }
        }
    }
}