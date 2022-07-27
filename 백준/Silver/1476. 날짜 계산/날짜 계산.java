import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int E = 1;
        int S = 1;
        int M = 1;
        for (int i = 1; ; i++) {
            if (E == 16) {
                E = 1;
            }
            if (S == 29) {
                S = 1;
            }
            if (M == 20) {
                M = 1;
            }
            if (E == e && S == s && M == m) {
                System.out.println(i);
                System.exit(0);
            }
            E++;
            S++;
            M++;
        }

    }
}
