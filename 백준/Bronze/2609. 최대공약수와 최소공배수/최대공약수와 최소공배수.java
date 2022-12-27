import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int big = Math.max(a, b);
        int min = Math.min(a, b);
        int remain = big % min;
        if (remain == 0) {
            int zero = min;
            System.out.println(zero);
            System.out.println(a * b / zero);
            System.exit(0);
        }
        int first = min;
        int second = remain;
        for (int i = 0; ; i++) {
            remain = first % second;
            if (remain == 0) {
                break;
            }
            first = second;
            second = remain;
        }
        System.out.println(second);
        System.out.println(a * b / second);

    }
}