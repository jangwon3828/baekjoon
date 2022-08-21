import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int iQ = Integer.parseInt(br.readLine());
        while (iQ-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long lA = Long.parseLong(st.nextToken());
            long lB = Long.parseLong(st.nextToken());
            if (lB % lA == 0 && lB / lA >= 2) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.println(sb);
    }
}