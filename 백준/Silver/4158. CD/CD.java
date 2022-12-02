import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (n == 0 && m == 0) {
                break;
            }
            HashSet<Integer> arr = new HashSet<>();
            int answer = 0;
            for (int i = 0; i < n; i++) {
                arr.add(Integer.parseInt(bf.readLine()));
            }

            for (int i = 0; i < m; i++) {
                if (arr.contains(Integer.parseInt(bf.readLine())))
                    answer++;
            }
            System.out.println(answer);

        }
    }
}

