import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static boolean c[];
    static int a[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        c = new boolean[n + 1];
        a = new int[m];

        go(1,0);

        System.out.println(sb);
    }

    public static void go(int at,int index) {
        if (index == m) {
            for (int i = 0; i < m; i++) {
                sb.append(a[i]).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = at; i <= n; i++) {
            a[index] = i;
            go(i,index + 1);
        }
    }
}