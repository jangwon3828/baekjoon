import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int dif = e - c; 
            if (r > dif) {
                sb.append("do not advertise\n");
            } else if (r == dif) {
                sb.append("does not matter\n");
            } else {
                sb.append("advertise\n");
            }
        }
        System.out.print(sb);
    }
}