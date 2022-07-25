import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int a[];
    static int b[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        a = new int[m];
        b = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            b[i]=Integer.parseInt(st.nextToken());
        Arrays.sort(b);
        go(0);

        System.out.println(sb);
    }

    public static void go(int index) {
        if (index == m) {
            for (int i = 0; i < m; i++) {
                sb.append(a[i]).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < n; i++) {
            a[index] = b[i];
            go(index + 1);

        }
    }
}
