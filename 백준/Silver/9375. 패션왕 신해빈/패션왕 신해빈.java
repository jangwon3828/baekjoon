import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            HashMap<String, Integer> hs = new HashMap<>();
            int m = Integer.parseInt(br.readLine());
            for (int j = 0; j < m; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String category = st.nextToken();
                hs.put(category, hs.getOrDefault(category, 0) + 1);
            }
            int total = 1;
            for (int num : hs.values()) {
                total *= (num + 1);
            }
            System.out.println(total-1);
        }
    }
}